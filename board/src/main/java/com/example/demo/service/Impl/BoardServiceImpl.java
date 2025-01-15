package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mappers.BoardMapper;
import com.example.demo.service.BoardDTO;
import com.example.demo.service.BoardSearchDTO;
import com.example.demo.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

//컨트롤에 서비스를 등록함.
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	//BoardMapper생성자 주입방식으로 만들어줘야함.
	//@AllArgsConstructor 필드가 하나라서 이를 사용해서 BoardMapper 생성자를 만듦
	//@RequiredArgsConstructor로 final이 붙은 필드만 생성자 자동 생성
	private final BoardMapper boardMapper;

	
	
	@Override
	public boolean register(BoardDTO board) {
		return boardMapper.insertBoard(board) == 1;
	}

	@Override
	public boolean modify(BoardDTO board) {
		return boardMapper.updateBoard(board) == 1 ? true : false;
	}

	@Override
	public boolean remove(Long bno) {
		return boardMapper.deleteBoard(bno) == 1;
	}

	@Override
	public BoardDTO get(Long bno) {
		return boardMapper.info(bno);
	}

	@Override
	public List<BoardDTO> getList(BoardSearchDTO searchDTO) {
		return boardMapper.findAll(searchDTO);
	}

	@Override
	public int getCount(BoardSearchDTO searchDTO) {
		return boardMapper.getCount(searchDTO);
	}

}
