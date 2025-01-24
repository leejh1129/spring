package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.BookDTO;
import com.example.demo.Service.BookService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	// 등록페이지
	@GetMapping("/save")
	public String save(Model model, BookDTO dto) {
		model.addAttribute("max", bookService.max());
		return "/insert";
	}
	
	// 등록 처리
	@PostMapping("/save")
	public String save(@Validated BookDTO dto) {
		bookService.insert(dto);
		return "redirect:list";
	}
	
	// 목록 조회
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", bookService.getList());
		log.info("list" + model);
		return "/list";
	}
	
	// 대여매출현황
	@GetMapping("/join")
	public String join(Model model) {
		model.addAttribute("list", bookService.join());
		return "/joinList";
	}
	
	

}
