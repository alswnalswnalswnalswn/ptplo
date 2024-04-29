package com.kh.thenolja.reservation.model.Service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.reservation.model.dao.ReserRepository;
import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.Reservation;

@Service
public class ReserServiceImpl implements ReserService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private ReserRepository reserRepository;
	
	@Override
	public List<Coupon> selectCouponList() {
		return reserRepository.selectCouponList(sqlSession);
	}

	@Override
	public List<Coupon> selectCoupon(int memberNo) {
		return reserRepository.selectCoupon(sqlSession, memberNo);
	}

	@Override
	public int insertReser(Reservation reser) {
		return reserRepository.insertReser(sqlSession, reser);
	}

	@Override
	public Reservation selectReservation(int reserNo) {
		return reserRepository.selectReservation(sqlSession, reserNo);
	}

}
