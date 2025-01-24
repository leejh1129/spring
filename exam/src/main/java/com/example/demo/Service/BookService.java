package com.example.demo.Service;

import java.util.List;

public interface BookService {

	public boolean insert(BookDTO dto);
	
	public List<BookDTO> getList();
	
	public String max();
	
	public List<RentDTO> join();
	
}
