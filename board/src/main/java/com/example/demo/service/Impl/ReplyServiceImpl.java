package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.mappers.ReplyMapper;
import com.example.demo.service.ReplyDTO;
import com.example.demo.service.ReplyPageDTO;
import com.example.demo.service.ReplySearchDTO;
import com.example.demo.service.ReplyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

	private final ReplyMapper replyMapper;
	
	@Override
	public boolean register(ReplyDTO reply) {
		return replyMapper.insertReply(reply) == 1;
	}

	@Override
	public boolean modify(ReplyDTO reply) {
		return replyMapper.updateReply(reply) == 1;
	}

	@Override
	public boolean remove(Long rno) {
		return replyMapper.deleteReply(rno) == 1;
	}

	@Override
	public ReplyDTO get(Long rno) {
		return replyMapper.read(rno);
	}

	@Override
	public ReplyPageDTO getList(ReplySearchDTO search, Long bno) {
		return new ReplyPageDTO(
				replyMapper.getCountByBno(bno),
				replyMapper.getList(search,bno));
	}


}
