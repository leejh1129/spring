package com.example.demo.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.service.BoardDTO;
import com.example.demo.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BoardServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	@DisplayName("게시글 수정")
	public void update() {
		BoardDTO board = BoardDTO.builder()
				.bno(3L)
				.title("서비스수정테스트")
				.content("서비스수정테스트중")
				.writer("서비스수정테스트작가")
				.build();
		boolean result = boardService.modify(board);
		
		
		assertThat(result).isEqualTo(true);
	}
	
}
