package com.kh.thenolja.hotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.thenolja.hotel.model.service.HotelService;
import com.kh.thenolja.hotel.model.vo.Hotel;

@Controller
public class hotelController {

	@Autowired
	private HotelService hotelService;
	
	@ResponseBody
	@RequestMapping("select.hotel")
	public ModelAndView selectHotel(int hotelNo, HttpSession session, ModelAndView mv) {
		Hotel hotel2 = hotelService.selectHotel(hotelNo);
		
		if(hotel2 != null) {
			session.setAttribute("hotel", hotelService.selectHotel(hotelNo));
			mv.setViewName("hotel/hotelDetail");
		} else {
			mv.addObject("errorMsg", "로그인 실패~~");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
}
