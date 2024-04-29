package com.kh.thenolja.hotel.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;

@Repository
public class HotelRepository {

	public Hotel selectHotel(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectOne("hotelMapper.selectHotel", hotelNo);
	}
	
	public List<HotelCard> selectRecomData(SqlSessionTemplate sqlSession){
		return sqlSession.selectList("hotelMapper.selectRecomData");
	}

	public Hotel selectHotels(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectOne("hotelMapper.selectHotel", hotelNo);
	}
	

}
