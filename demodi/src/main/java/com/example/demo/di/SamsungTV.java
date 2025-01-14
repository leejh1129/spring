package com.example.demo.di;

import lombok.Data;

// @Component
@Data
public class SamsungTV implements TV {

	final Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}
	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
