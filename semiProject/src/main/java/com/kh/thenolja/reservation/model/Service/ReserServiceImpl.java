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
	public Reservation insertReser(Reservation reser, int reMemNo) {
		if(reserRepository.insertReser(sqlSession, reser) > 0 ) {
		//int reserNo = reser.getReserNo();
		reser = reserRepository.selectReservation(sqlSession, reMemNo);
		}
		return reser;
	}
/*
	@Override
	public Reservation selectReservation(int reserNo) {
		return reserRepository.selectReservation(sqlSession, reserNo);
	}
*/

	@Override
	public List<Reservation> selectList(int reMemNo) {
		return reserRepository.selectList(sqlSession, reMemNo);
	}

	@Override
	public Reservation selectReserNo(int reserNo) {
		return reserRepository.selectReserNo(sqlSession, reserNo);
	}

	
}
