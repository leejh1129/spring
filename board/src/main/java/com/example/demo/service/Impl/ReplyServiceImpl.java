package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.Paging;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.mapper.ReplyMapper;
import com.example.demo.service.ReplyDTO;
import com.example.demo.service.ReplyPageDTO;
import com.example.demo.service.ReplySearchDTO;
import com.example.demo.service.ReplyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

	private final ReplyMapper replyMapper;
	private final BoardMapper boardMapper;
	
	@Transactional
	@Override
	public boolean register(ReplyDTO reply) {
		
		boardMapper.updateReplyCnt(reply.getBno(), 1);
		
		return replyMapper.insertReply(reply) == 1;
	}

	@Override
	public boolean modify(ReplyDTO reply) {
		return replyMapper.updateReply(reply) == 1;
	}

	@Transactional
	@Override
	public boolean remove(Long rno) {
		
		ReplyDTO reply = replyMapper.read(rno);
		
		boardMapper.updateReplyCnt(reply.getBno(), -1);
		return replyMapper.deleteReply(rno) == 1;
	}

	@Override
	public ReplyDTO get(Long rno) {
		return replyMapper.read(rno);
	}

	@Override
	public ReplyPageDTO getList(ReplySearchDTO search, Long bno) {
		Paging paging = new Paging();
		int cnt = replyMapper.getCountByBno(bno);
		
		// paging - 전체건수, pageUnit, page
		paging.setPage(search.getPage());
		paging.setPageUnit(search.getAmount());
		paging.setTotalRecord(cnt);
		
		return new ReplyPageDTO(
				cnt,
				paging,
				replyMapper.getList(search,bno));
	}


}
