package com.kh.thenolja.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.thenolja.hotel.model.service.HotelService;

@Controller
public class RoomController {
	
	@Autowired
	private HotelService hotelService;
	
	
}
