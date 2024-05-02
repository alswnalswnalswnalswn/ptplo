package com.kh.thenolja.reservation.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.Reservation;

@Repository
public class ReserRepository {

	public List<Coupon> selectCouponList(SqlSessionTemplate sqlSession) {
		return sqlSession.selectList("reserMapper.selectCouponList");
	}

	public List<Coupon> selectCoupon(SqlSessionTemplate sqlSession, int memberNo) {
		return sqlSession.selectList("reserMapper.selectCouponList", memberNo);
	}

	public int insertReser(SqlSessionTemplate sqlSession, Reservation reser) {
		return sqlSession.insert("reserMapper.insertReser", reser);
	}

	public Reservation selectReservation(SqlSessionTemplate sqlSession, int reMemNo) {
		return sqlSession.selectOne("reserMapper.selectReservation", reMemNo);
	}

	public List<Reservation> selectList(SqlSessionTemplate sqlSession, int reMemNo) {
		return sqlSession.selectList("reserMapper.selectList", reMemNo);
	}

	public Reservation selectReserNo(SqlSessionTemplate sqlSession, int reserNo) {
		return sqlSession.selectOne("reserMapper.selectReserNo", reserNo);
	}
}
