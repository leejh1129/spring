package com.example.demo.insa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.insa.service.DeptDTO;
import com.example.demo.insa.service.DeptService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController	// return 값은 데이터, controller = 뷰 페이지
@RequiredArgsConstructor
@RequestMapping("/dept/*")
public class DeptController {

	private final DeptService service;
	
	@GetMapping("/list")
	public List<DeptDTO> list() {
		return service.getList();
	}
	
	@GetMapping("/read")
	public DeptDTO read(@RequestParam(name="deptID") Long deptId) {
		return service.read(deptId);
	}
	
}
