package com.example.demo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.service.ReplyDTO;
import com.example.demo.service.ReplySearchDTO;

public interface ReplyMapper {

	//등록
	public int insertReply(ReplyDTO replyDto);
		
	//수정
	public int updateReply(ReplyDTO replyDto);
		
	//삭제
	public int deleteReply(Long rno);
		
	//단건조회
	public ReplyDTO read(Long bno);
		
	//전체 조회
	public List<ReplyDTO> getList(@Param("cri") ReplySearchDTO cri,
			                      @Param("bno") Long bno);
		
	//전체 개수
	public int getCountByBno(Long bno);
	
}
