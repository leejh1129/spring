package com.example.demo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.service.BoardDTO;
import com.example.demo.service.BoardSearchDTO;

public interface BoardMapper {
	//등록
	int insertBoard(BoardDTO boardDto);
	
	//수정
	int updateBoard(BoardDTO boardDto);
	
	//삭제
	int deleteBoard(long bno);
	
	//단건조회
	BoardDTO info(long bno);
	
	//전체 조회
	List<BoardDTO> findAll(BoardSearchDTO searchDTO);
	
	//전체 개수
	int getCount(BoardSearchDTO searchDTO);
	
	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
	
}