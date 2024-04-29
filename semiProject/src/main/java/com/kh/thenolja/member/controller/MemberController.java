package com.kh.thenolja.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.thenolja.member.model.service.MemberService;
import com.kh.thenolja.member.model.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("loginPage")
	public String loginPage() {
		return "member/login";
	}
	
	   // 로그인 기능
	   @RequestMapping("login.member")
	   public ModelAndView login(Member member, HttpSession session, ModelAndView mv) { 
	      
	      Member loginUser = memberService.login(member);
	      
	      if(loginUser != null) {
	         session.setAttribute("loginUser", loginUser);
	         mv.setViewName("redirect:/");
	      } else {
	         mv.addObject("errorMsg", "로그인 실패");
	         mv.setViewName("common/errorPage");
	      }
	      return mv;
	   }
	
	
	@RequestMapping("memberJoin")
	public String join() {
		return "member/memberJoin";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
