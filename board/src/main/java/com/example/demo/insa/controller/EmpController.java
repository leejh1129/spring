package com.example.demo.insa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.insa.service.EmpDTO;
import com.example.demo.insa.service.EmpService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/emp/*")
public class EmpController {

	private final EmpService empService;
	
	// 사원 전체 조회
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", empService.getList());
		return "emp/list";
	}
	
	// 사원등록 페이지
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("jobList", empService.getJobList());
		model.addAttribute("list", empService.max());
		return "emp/register";
	}
	
	// 사원등록 처리
	@PostMapping("/register")
	public String register(@Validated EmpDTO dto,
			               BindingResult bindingResult,
			               RedirectAttributes rttr) {
		
	    if(bindingResult.hasErrors()) {
	    	return "redirect:register";
	    }
		log.info(dto.toString());
		empService.register(dto);
		
		rttr.addFlashAttribute("result", true);
		
		return "redirect:list";
	}
	
	// 사원 삭제 
	@GetMapping("/empDel")
	public String emldel(@RequestParam(name="employeeId") Long employeeId,
			             RedirectAttributes rttr) {
		
		empService.delete(employeeId);
		rttr.addFlashAttribute("delResult", true);
		
		return "redirect:list";
	}
	 
}
