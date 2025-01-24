package com.example.demo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleVO {
	
	@JsonIgnore 	//데이터 전송시 mno 제외
	private int mno;
	//@JsonProperty("fname")	// 키 명 변경
	private String firstName;
	private String lastName;
	@JsonFormat(pattern = "yyyy-MM-dd")	// 데이터 포맷
	private Date regdate;
	
}
