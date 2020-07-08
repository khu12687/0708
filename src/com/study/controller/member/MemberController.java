package com.study.controller.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.model.member.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/list", method=RequestMethod.GET)
	public ModelAndView selectAll() {
		//3단계 : 알맞는 로직 객체에 일 시키기
		List list = memberService.selectAll();
		
		//4단계 : jsp로 가져갈것이 있다면, 결과 저장!!
		ModelAndView mav =null;
		mav = new ModelAndView("member/list2");
		mav.addObject("list",list); //모델 저장!!
		return mav;
	}
}
