package com.example.demo.insa.mapper;

import java.util.List;

import com.example.demo.insa.service.DeptDTO;


public interface DeptMapper {

	List<DeptDTO> getList();
	
	DeptDTO read(long deptId);
	
}
