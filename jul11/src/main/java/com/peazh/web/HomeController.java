package com.peazh.web;
// 기본 틀
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	// 슬러시(/) 요청 들어왔을 때 아래가 동작할거야~
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	// 갈 수 있는 jsp 파일명 바로 적어주기
	@RequestMapping(value="/home")
	public String home() {
		return "home2";
	}
	
	// 컨트롤러 통과해야함 (서블릿처럼)
	// main.jsp 파일 만들어주기
	
	// 박스 안에 값들을 담아서 보낸다고 생각하면 됨
	// modelandView라는 박스
	
	@RequestMapping("/main")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("main"); //main은 jsp 파일명
		
		// 리스트 만들어주기 (list = 10 ~ 100)
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i < 101; i+=10) {
			list.add(i);
		}
		
		// list 보내기
		mv.addObject("list", list);
		
		// 객체를 넣을건데 객체 이름과 값
		// setattribute랑 같음
		mv.addObject("name", "홍길동");//객체 보내기
		return mv;
	}
	
}
