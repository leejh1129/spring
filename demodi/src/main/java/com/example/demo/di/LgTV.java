package com.example.demo.di;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class LgTV implements TV {

	final Speaker speaker;	
	int price;
		
	public void powerOn() {
		System.out.println("LG TV--전원 on");
	}
	public void powerOff() {
		System.out.println("LG TV--전원 off");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
