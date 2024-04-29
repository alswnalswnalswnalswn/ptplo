package com.kh.thenolja.hotel.model.service;

import java.util.List;

import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;
import com.kh.thenolja.hotel.model.vo.Room;
import com.kh.thenolja.hotel.model.vo.SearchOptions;

public interface HotelService {
	
	Hotel selectHotel(int hotelNo);

	List<HotelCard> selectRecomData();

	List<String> selectLocation();

	Room selectRoom(int hotelNo);

	List<HotelCard> searchList(SearchOptions so);
	

}
