package com.example.demo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller		// 빈등록, 서블릿 커맨드
@RequestMapping("/sample")
public class SampleController {

	//Logger log = LoggerFactory.getLogger(SampleController.class);
	
	// ModelAttribute로 보냇기 때문에 어떤 url요청이라도 값을 불러올수 있음
	@ModelAttribute("dept")
	public List<String> deptList(){
		return Arrays.asList("기획","개발","인사");
	}
	
	
	@GetMapping("/ex03")
	public ModelAndView ex03(@ModelAttribute(name = "todo") TodoDto dto, Model model) {
		ModelAndView mv = new ModelAndView("sample");
		mv.addObject("serverTime", new Date());
		log.debug("todoDTO : " + dto);
		return mv;	// 포워드 : request 전달
	}
	
	
//	@GetMapping("/ex03")
//	public String ex03(@ModelAttribute(name = "todo") TodoDto dto, Model model) {
//		model.addAttribute("serverTime", new Date());
//		log.debug("todoDTO : " + dto);
//		return "sample";	// 포워드 : request 전달
//	}
	
	
	//여러 파라미터값 배열로 보낼려고 했는데 server버전 올라가서 인코딩 후 보내야되서 post로 확인함(URL에 [] 들어가서 GET으로 확인안됨)
	//http://localhost:81/sample/ex02Bean?list[0].name=kim&list[0].age=10&list[1].name=park&list[1].age=20
	@PostMapping("/ex02Bean")
	public String ex02Bean(SampleDtoList dtoList) {
		log.debug("dtoList: " + dtoList);
		return "sample";
	}
	
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam List<String> hobby) {
		log.debug("hobby:" + hobby);
		return "sample";
	}
	
	
	// 파라미터값 둘다 올수도 안올수도있는 처리 방식 required = 필수값인지 여부 지정(true, false)
	// defaultValue = 기본값 지정
	@GetMapping("/ex02")
	public String ex02(@RequestParam(name="username") String name,
			           @RequestParam(required = false, defaultValue = "5") int age) {
		//String name = request.getParamter("username")
		//if null ==> 초기값 지정
		log.debug("name : " + name);
		log.debug("age : " + age);
		return "sample";
	}
	
	// vo로 받는 방식
	@GetMapping("/ex01")
	public String ex01(SampleDto dto) {
		log.debug(dto.toString());
		return "sample";
	}
	
	
	@GetMapping("a")
	//@RequestMapping(value="a", method = { RequestMethod.GET, RequestMethod.POST })
	public String main() {
		log.info("sample a");
		return "sample";
	}
	
	@GetMapping("b")
	public String basicb() {
		log.info("sample b");
		return "sample";
	}
	
}
