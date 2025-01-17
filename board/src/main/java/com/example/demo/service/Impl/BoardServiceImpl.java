package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mappers.BoardMapper;
import com.example.demo.mappers.ReplyMapper;
import com.example.demo.service.BoardDTO;
import com.example.demo.service.BoardSearchDTO;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

//컨트롤에 서비스를 등록함.
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	//BoardMapper생성자 주입방식으로 만들어줘야함.
	//@AllArgsConstructor 필드가 하나라서 이를 사용해서 BoardMapper 생성자를 만듦
	//@RequiredArgsConstructor로 final이 붙은 필드만 생성자 자동 생성
	private final BoardMapper boardMapper;

	private final ReplyMapper replyMapper;
	
	
	@Override
	public boolean register(BoardDTO board) {
		return boardMapper.insertBoard(board) == 1;
	}

	@Override
	public boolean modify(BoardDTO board) {
		return boardMapper.updateBoard(board) == 1 ? true : false;
	}

	@Override
	@Transactional
	public boolean remove(Long bno) {
		// 댓글 삭제
		replyMapper.deleteByBno(bno);
		// 게시글 삭제
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
