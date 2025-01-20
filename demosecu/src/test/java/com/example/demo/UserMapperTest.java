package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.securingweb.mapper.UserMapper;
import com.example.demo.securingweb.service.RoleDTO;
import com.example.demo.securingweb.service.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class UserMapperTest {

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void test() {
		
		UserDTO user = userMapper.getUser("user");
		//List<RoleDTO> list = userMapper.getRole(user.getId());
		
		log.info("user : " + user.toString());
		//log.info("list : " + list);
		
	}
	
}
