package com.example.demo.Service;

import java.util.Date;

import lombok.Data;

@Data
public class RentDTO {

	private Long rentNo;    
	private Long bookNo;    
	private Long rentPrice; 
	private Date rentDate;  
	private String rentStatus;
	private String bookName;
	
}
