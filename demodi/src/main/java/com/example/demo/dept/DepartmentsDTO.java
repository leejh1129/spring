package com.example.demo.dept;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentsDTO {
	
	private String departmentId;
	private String departmentName;
	private String managerId;
	private String locationId;
	
}
