package com.example.demo.insa.service;

import java.util.List;

public interface EmpService {

	// 사원 등록
	public boolean register(EmpDTO dto);
	
	// 사원 전체 조회
	public List<EmpDTO> getList();
	
	// jobId 조회
	public List<JobsDTO> getJobList();
	
	// 사원아이디 맥스 값 
	public String max();
	
	// 사원 삭제
	public boolean delete(Long employeeId);
	
}
