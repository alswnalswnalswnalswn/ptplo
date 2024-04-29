package com.kh.thenolja.reservation.model.Service;

import java.util.List;

import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.Reservation;

public interface ReserService {

	List<Coupon> selectCouponList();

	List<Coupon> selectCoupon(int memberNo);

	int insertReser(Reservation reser);

	Reservation selectReservation(int reserNo);

}
