package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Service.BookDTO;
import com.example.demo.Service.BookService;
import com.example.demo.Service.RentDTO;
import com.example.demo.mapper.BookMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

	private final BookMapper bookMapper;

	@Override
	public boolean insert(BookDTO dto) {
		return bookMapper.insert(dto) == 1;
	}

	@Override
	public List<BookDTO> getList() {
		return bookMapper.getList();
	}

	@Override
	public String max() {
		return bookMapper.max();
	}

	@Override
	public List<RentDTO> join() {
		return bookMapper.join();
	}
	
}
