package com.example.demo.insa.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmpDTO {

	private Long employeeId;
	private String firstName;
	@NotBlank(message = "성을 입력하세요")
	private String lastName;
	@Email
	private String email;
	private String phoneNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;
	private String jobId;
	private Long salary;
	private double commissionPct;
	private Long managerId;
	private Long departmentId;
	
}
