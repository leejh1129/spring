package com.example.demo.service;

import java.util.List;

public interface ReplyService {

	public boolean register(ReplyDTO reply);

	public boolean modify(ReplyDTO reply);

	public boolean remove(Long rno);

	public ReplyDTO get(Long rno);

	public ReplyPageDTO getList(ReplySearchDTO search, Long bno);
	
	
}
