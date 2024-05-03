package com.kh.thenolja.reservation.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Reservation {

	private int reserNo;
	private Date reserDate;
	private String bicycle;
	private String cancelYN;
	private String checkIn;
	private String checkOut;
	private int people;
	private int roomNo;
	private String reMemNo;
	private String payment;
	private int paymentPrice;
	
	
	private String reserPhone;
	private String reserName;
	private int memNo;
	private String hotelName;
	private String roomName;
	private int roomPrice;
	private String checkInTime;
	private String checkOutTime;
	private int hotelNo;
	private int roomNum;
	private String hotelPath;
	private boolean reserStatus;


	
}
