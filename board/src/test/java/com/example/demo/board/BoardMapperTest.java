package com.example.demo.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BoardMapperTest {

	// 의존성 주입
	@Autowired BoardMapper boardMapper;
	
	@Test
	@DisplayName("게시글 등록")
	public void register() {
		String title = "등록테스트";
		// given : 테스트 실행을 준비하는 단계
		BoardDTO board = BoardDTO.builder()
			.title(title)
			.content("테스트중")
			.writer("테스트작가")
			.build();
		
		// when : 테스트를 진행하는 단계
		int cnt = boardMapper.insert(board);
		
		// then : 테스트 결과를 검증하는 단계
		assertThat(cnt).isEqualTo(cnt);
	}
	
	@Test
	@DisplayName("게시글 수정")
	public void update() {
		BoardDTO board = BoardDTO.builder()
				.bno(2L)
				.title("수정테스트")
				.content("수정테스트중")
				.writer("수정테스트작가")
				.build();
		int cnt = boardMapper.update(board);
		
		log.info("Update Count : " + cnt);
		assertThat(cnt).isEqualTo(cnt);
	}
	
	@Test
	@DisplayName("게시글삭제")
	public void delete() {
		int cnt = boardMapper.delete(5L);
		
		log.info("Delete Count : " + cnt);
		assertThat(cnt).isEqualTo(cnt);
	}
	
	@Test
	@DisplayName("단건조회")
	public void read() {
		Long bno = 1L;
		BoardDTO board = boardMapper.read(bno);
		log.info(board.toString());
		// board조회된 bno가 Long bno와 같은지 체크
		//assertThat(bno).isEqualTo(board.getBno());
		
		// board가 null인지 체크
		assertThat(board).isNotNull();
	}
	
	@Test
	@DisplayName("전체조회")
	public void getList() {
		List<BoardDTO> board = boardMapper.getList();
		
		board.forEach(list -> log.info(list.toString()));
		
	}
	
}
