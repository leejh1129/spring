package com.example.demo;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.di.Resutaurant;
import com.example.demo.di.TV;

@SpringBootTest
public class DiTest {

//	@Autowired TV tv;
//	//@Autowired ApplicationContext context;	// 스프링 IoC 컨테이너(빈을 담고있는)
//	
//	@Test
//	@DisplayName("객체생성")
//	public void test() {
//		
//		//TV tv = context.getBean(TV.class);
//		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//
//	}
	
	@Autowired Resutaurant resutaurant;
	@Test
	public void dites2() {
		resutaurant.getChef().getName();
	}
	
	
}
