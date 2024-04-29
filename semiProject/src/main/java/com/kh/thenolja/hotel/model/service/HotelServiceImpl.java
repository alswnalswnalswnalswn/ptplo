package com.kh.thenolja.hotel.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.hotel.model.dao.HotelRepository;
import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel selectHotel(int hotelNo) {
		return hotelRepository.selectHotel(sqlSession, hotelNo);
	}

	@Override
	public List<HotelCard> selectRecomData() {
		return hotelRepository.selectRecomData(sqlSession);
	}

}
