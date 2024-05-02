package com.kh.thenolja.reservation.model.Service;

import java.util.List;
import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.reservation.model.vo.Reservation;

public interface ReserService {

	List<Coupon> selectCouponList();

	List<Coupon> selectCoupon(int memberNo);

	Reservation insertReser(Reservation reser, int reMemNo);

	List<Reservation> selectList(int reMemNo);

	Reservation selectReserNo(int reserNo);


	// Reservation selectReservation(int reserNo);

}
