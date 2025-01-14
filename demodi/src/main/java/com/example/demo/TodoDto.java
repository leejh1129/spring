package com.example.demo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDto {

	private String title;
	// pattern에 정의한 모든 값을 넘겨줘야 받음
	@DateTimeFormat(pattern = "yyyy-MM")
	private Date dueData;
	
}
