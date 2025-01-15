package com.example.demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.**.mappers")
public class BoardAppplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardAppplication.class, args);
	}

}
