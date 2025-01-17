package com.example.demo.insa.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpDTO {

	private Long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private Long salary;
	private double commissionPct;
	private Long managerId;
	private Long departmentId;
	
}
