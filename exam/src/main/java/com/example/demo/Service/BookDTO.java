package com.example.demo.Service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookDTO {

	private Long bookNo;       
	private String bookName;     
	private String bookCoverimg; 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookDate;     
	private Long bookPrice;    
	private String bookPublisher;
	private String bookInfo;
	
}
