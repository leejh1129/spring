package com.example.demo.insa.service;

import java.util.List;

public interface EmpService {

	// 사원 등록
	public boolean register(EmpDTO dto);
	
	// 사원 전체 조회
	public List<EmpDTO> getList();
	
	// jobId 조회
	public List<JobsDTO> getJobList();
	
}
