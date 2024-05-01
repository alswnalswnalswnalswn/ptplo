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
import com.kh.thenolja.common.model.vo.PageInfo;
import com.kh.thenolja.hotel.model.service.HotelService;
import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;
import com.kh.thenolja.hotel.model.vo.Room;
import com.kh.thenolja.hotel.model.vo.SearchData;
import com.kh.thenolja.hotel.model.vo.SearchOptions;
import com.kh.thenolja.reservation.model.vo.ReserInfo;

@Controller
public class hotelController {

	@Autowired
	private HotelService hotelService;
	
	@ResponseBody
	@RequestMapping("select.hotel")
	public ModelAndView selectHotel(int hotelNo, HttpSession session, ModelAndView mv) {
		Hotel hotel2 = hotelService.selectHotel(hotelNo);
		Room room = hotelService.selectRoom(hotelNo);
		// System.out.println(room);
		if(hotel2 != null && room != null) {
			session.setAttribute("hotel", hotelService.selectHotel(hotelNo));
			session.setAttribute("room", hotelService.selectRoom(hotelNo));
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
	
	@ResponseBody
	@GetMapping(value="searchLocation.jqAjax", produces="application/json; charset=UTF-8")
	public String searchLocation() {
		List<String>  locList = hotelService.selectLocation();
		return new Gson().toJson(locList);
	}
	/*
	@ResponseBody
	@RequestMapping(value="searchList.hotels", produces="application/json; charset=UTF-8")
	public String searchList(String startDate, String endDate, String location, int maxPeople, HttpSession session) {
		String view = "";
		
		SearchOptions so = new SearchOptions();
		
		so.setMaxPeople(maxPeople);
		so.setLocation(location);
		so.setStartDate(startDate);
		so.setEndDate(endDate);
	
		List<HotelCard> sList = hotelService.searchList(so);
		
		session.setAttribute("sList", sList);
		view = "views/hotel/searchList.jsp";
		return view;
	}
	*/
	
	/*
	@RequestMapping("insertReservation")
	public String insertReservation(String startDate, String endDate, String location, int maxPeople, HttpSession session) {
		ReserInfo rinfo = new ReserInfo();
		rinfo.setStartDate(startDate);
		rinfo.setEndDate(endDate);
		rinfo.setPeople(maxPeople);
		
		
		return "reservation/insertReservation";
	}
	*/
	
	
	
	
	
	
	
	
}
