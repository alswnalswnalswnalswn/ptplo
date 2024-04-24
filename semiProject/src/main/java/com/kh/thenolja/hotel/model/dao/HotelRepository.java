package com.kh.thenolja.hotel.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.hotel.model.vo.Hotel;

@Repository
public class HotelRepository {

	public Hotel selectHotel(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectOne("hotelMapper.selectHotel", hotelNo);
	}
	
	

}
