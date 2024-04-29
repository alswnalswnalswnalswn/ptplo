package com.kh.thenolja.hotel.model.service;

import java.util.List;

import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;

public interface HotelService {
	
	Hotel selectHotel(int hotelNo);

	List<HotelCard> selectRecomData();
	

}
