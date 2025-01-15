package com.example.demo.insa.service;

import java.util.List;

public interface DeptService {

	public List<DeptDTO> getList();
	
	public DeptDTO read(long deptId);
	
}
