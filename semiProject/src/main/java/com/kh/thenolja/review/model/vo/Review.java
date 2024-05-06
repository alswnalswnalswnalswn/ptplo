package com.kh.thenolja.review.model.vo;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Review {
	
	private int reserNo;
	private String imgPath;
	private String reviewContent;
	private String score;
	private Date createDate;
	private String reviewYN;
	private Date reserDate;
	private String bicycle;
	private String cancelYN;
	private String checkIn;
	private String checkOut;
	private int people;
	private int roomNo;
	private int reMemNo;
	private String payment;
	private int paymentPrice;
	private String phone;
	private String name;
	private int memNo;
	private String hotelName;
	private String roomName;
	private int roomPrice;
	private String checkInTime;
	private String checkOutTime;
	private int hotelNo;
	private int roomNum;
	private String hotelPath;
	private String nickName;
    private int fileNo;
    private int refBno;
    private String originName;
    private String changeName;
    private String filePath;
}
