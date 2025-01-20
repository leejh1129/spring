package com.example.demo.securingweb.mapper;

import java.util.List;

import com.example.demo.securingweb.service.RoleDTO;
import com.example.demo.securingweb.service.UserDTO;

public interface UserMapper {

	UserDTO getUser(String loginId);
	
	List<RoleDTO> getRole(Long id);
	
}
