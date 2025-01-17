package com.example.demo.insa.mapper;

import java.util.List;

import com.example.demo.insa.service.EmpDTO;
import com.example.demo.insa.service.JobsDTO;

public interface EmpMapper {

	// 사원 등록
	public int register(EmpDTO dto);
	
	// 사원 전체 조회
	public List<EmpDTO> getList();
	
	// jobs 조회
	public List<JobsDTO> getJobList();
	
}
