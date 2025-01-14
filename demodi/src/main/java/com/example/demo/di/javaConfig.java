package com.example.demo.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
// 외부라이브러리에서 받아올때 빈등록하는법
public class javaConfig {

	@Bean
	public Speaker speaker() {
		System.out.println("speaker 등록");
		return new AppleSpeaker();
	}
	
	@Bean
	public TV tv() {
		System.out.println("tv등록");
		return new SamsungTV(speaker());
	}
	
}
