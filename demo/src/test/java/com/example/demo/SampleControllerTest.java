package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerTest {

	 @Autowired MockMvc mvc;
	
	@Test
    @DisplayName("Ticket 단건 조회")
    void getreply() throws Exception {

    	//given
    	Long rno = 2L;
    	String url = "/getSample";

    	//when
    	mvc.perform(
    			get(url).
    			accept(MediaType.APPLICATION_JSON_VALUE)
    	)
    	//then
    	.andExpect(status().isOk())
    	.andExpect(jsonPath("$.firstName").value("길동"))
       .andDo(print())  ;

    }
	
}
