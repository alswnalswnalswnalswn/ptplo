package com.kh.thenolja.refund.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.thenolja.refund.model.service.RefundService;
import com.kh.thenolja.refund.model.vo.Refund;

@Controller
public class RefundController {
	
	@Autowired
	private RefundService refundService;
	
	@PostMapping("refund.insert")
	public ModelAndView insertRefund(Refund refund, int reserNo, ModelAndView mv, HttpSession session) {
		
		refund = refundService.insertRefund(refund, reserNo);
		
		if(refund != null) {
			session.setAttribute("refund", refund);
			mv.setViewName("refund/detailRefund");
		} else {
			mv.addObject("errorMsg", "예약 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
}
