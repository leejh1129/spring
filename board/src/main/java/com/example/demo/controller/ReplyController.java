package com.example.demo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ReplyDTO;
import com.example.demo.service.ReplyPageDTO;
import com.example.demo.service.ReplySearchDTO;
import com.example.demo.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/replies/")
@RequiredArgsConstructor
public class ReplyController {
	
	private final ReplyService service;
	
	// 등록처리
	@PostMapping("/new")
	public ReplyDTO register(@RequestBody ReplyDTO dto) {
		service.register(dto);
		return dto;
	}
	
	// 수정처리
	@PutMapping("/{rno}")
	public String modify(
			   @RequestBody ReplyDTO replyDTO,
			   @PathVariable(name="rno") Long rno){
		replyDTO.setRno(rno);
		service.modify(replyDTO);
		return "success";
		
	}
	
	// 삭제처리 localhost:81/replies/2
	@DeleteMapping("/{rno}")
	public String remove(@PathVariable(name="rno") Long rno){
		service.remove(rno);
		return "success";
	}
	
	
	//단건조회
	@GetMapping("/{rno}")
	public ReplyDTO get(@PathVariable("rno") Long rno) {
		return service.get(rno);
	}
	
	//댓글목록조회
	//localhost:81/replies/pages/2/1
	@GetMapping("/pages/{bno}/{page}")
	public ReplyPageDTO getList(@PathVariable(name="page") int page,
			                    @PathVariable(name="bno") Long bno) {
		ReplySearchDTO replySearchDTO = new ReplySearchDTO(page, 10);
		return service.getList(replySearchDTO, bno);
	}
	
	

}