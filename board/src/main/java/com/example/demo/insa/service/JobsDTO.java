package com.example.demo.insa.service;

import lombok.Data;

@Data
public class JobsDTO {

	private String jobId;
	private String jobTitle;
	private Long minSalary;
	private Long maxSalary;
	
}
