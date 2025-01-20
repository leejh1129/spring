package com.example.demo.securingweb.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserDTO{

	private Long id;
	private String loginId;
	private String password;
	private String fullName;
	private String deptName;
	
	private List<RoleDTO> roles;
	
}
