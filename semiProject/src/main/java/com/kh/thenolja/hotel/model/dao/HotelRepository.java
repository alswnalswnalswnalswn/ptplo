package com.kh.thenolja.hotel.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.hotel.model.vo.Hotel;
import com.kh.thenolja.hotel.model.vo.HotelCard;
import com.kh.thenolja.hotel.model.vo.Room;
import com.kh.thenolja.hotel.model.vo.SearchOptions;

@Repository
public class HotelRepository {

	public Hotel selectHotel(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectOne("hotelMapper.selectHotel", hotelNo);
	}
	
	public List<HotelCard> selectRecomData(SqlSessionTemplate sqlSession){
		return sqlSession.selectList("hotelMapper.selectRecomData");
	}

	public List<String> selectLocation(SqlSessionTemplate sqlSession) {
		return sqlSession.selectList("hotelMapper.selectLocation");
	}

	public Room selectRoom(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectOne("hotelMapper.selectRoom", hotelNo);
	}

	public List<HotelCard> searchList(SqlSessionTemplate sqlSession, SearchOptions so) {
		return sqlSession.selectList("hotelMapper.searchList", so);
	}
	

}
