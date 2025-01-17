package com.example.demo.insa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.insa.mapper.EmpMapper;
import com.example.demo.insa.service.EmpDTO;
import com.example.demo.insa.service.EmpService;
import com.example.demo.insa.service.JobsDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService{

	private final EmpMapper empmapper;

	// 사원 등록
	@Override
	public boolean register(EmpDTO dto) {
		return empmapper.register(dto) == 1;
	}

	// 사원 전체 조회
	@Override
	public List<EmpDTO> getList() {
		return empmapper.getList();
	}

	// job_id 조회
	@Override
	public List<JobsDTO> getJobList() {
		return empmapper.getJobList();
	}
	
	

}
