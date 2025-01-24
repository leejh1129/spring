package com.example.demo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompVO {

		private List<Ticket> list;
		private SampleVO sample;
		private int cnt;
		@JsonFormat(pattern = "yyyy-MM-dd")
		private Date regdate;
	
}
