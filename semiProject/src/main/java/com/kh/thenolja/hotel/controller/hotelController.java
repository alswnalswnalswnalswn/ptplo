package com.kh.thenolja.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.kh.thenolja.hotel.model.service.HotelService;
import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;

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
			mv.addObject("errorMsg", "찾을 수 없습니다.");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	@ResponseBody
	@GetMapping(value="locRecomData.jqAjax", produces="application/json; charset=UTF-8")
	public String selectRecomData() {
		List<HotelCard> rList = hotelService.selectRecomData();
		return new Gson().toJson(rList);
	}
	
}
