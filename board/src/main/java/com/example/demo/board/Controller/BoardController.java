package com.example.demo.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.board.service.BoardDTO;
import com.example.demo.board.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
	
	private BoardService service;
	
	// 전체조회
	// @ResponseBody
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
	}
	
	// 등록 페이지
	@GetMapping("/register")
	public void register()	{}
	
	// 등록처리
	@PostMapping("/register")
	public String register(BoardDTO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		service.register(board);	
		
		//rttr.addAttribute("result", true); = 사라지지않고 계속 남아있음
		rttr.addFlashAttribute("result", true);	// 회발성으로 한번만 출력되고 새로고침되면 사라짐
		return "redirect:/board/list";
	}
	
	// 수정페이지 or 상세페이지
	@GetMapping({"/modify", "/get"})
	public void modify(@RequestParam(name="bno") Long bno, Model model) {
		BoardDTO board = service.get(bno);
		model.addAttribute("board", board);
	}
	
	// 수정처리
	@PostMapping("/modify")
	public String modify(BoardDTO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		service.modify(board);	
		
		//rttr.addAttribute("result", true); = 사라지지않고 계속 남아있음
		rttr.addFlashAttribute("update", true);	// 회발성으로 한번만 출력되고 새로고침되면 사라짐
		return "redirect:/board/list";
	}
	
	// 삭제처리
	@GetMapping("/remove")
	public String remove(@RequestParam(name="bno") Long bno, RedirectAttributes rttr) {
		log.info("remove : " + bno);
		service.remove(bno);	
		
		//rttr.addAttribute("result", true); = 사라지지않고 계속 남아있음
		rttr.addFlashAttribute("remove", true);	// 회발성으로 한번만 출력되고 새로고침되면 사라짐
		return "redirect:/board/list";
	}

	
}
