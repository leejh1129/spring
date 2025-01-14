package com.example.demo.board.mapper;

import java.util.List;



import com.example.demo.board.service.BoardDTO;

public interface BoardMapper {

	int insert(BoardDTO dto);
	int update(BoardDTO dto);
	int delete(Long bno);
	BoardDTO read(Long bno);
	List<BoardDTO> getList();
	
}
