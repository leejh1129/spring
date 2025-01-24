package com.example.demo.mapper;

import java.util.List;

import com.example.demo.Service.BookDTO;
import com.example.demo.Service.RentDTO;

public interface BookMapper {

	public int insert(BookDTO dto);
	
	public List<BookDTO> getList();
	
	public String max();
	
	public List<RentDTO> join();
	
}
