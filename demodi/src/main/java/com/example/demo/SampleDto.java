package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // 생성자 대신 사용
@NoArgsConstructor
@AllArgsConstructor
public class SampleDto {

	private String name;
	private int age;
	private String tel;
	
}
