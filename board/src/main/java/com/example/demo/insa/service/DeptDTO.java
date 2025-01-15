package com.example.demo.insa.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {

	private long departmentId;
	private String departmentName;
	private long managerId;
	private long locationId;
	
}
