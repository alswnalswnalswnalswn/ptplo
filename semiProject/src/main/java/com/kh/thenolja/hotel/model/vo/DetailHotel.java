package com.kh.thenolja.hotel.model.vo;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @NoArgsConstructor
public class DetailHotel {
	private String hotelName;
	private String hotelPath; // 사진경로
	private String hotelCate;
	private String hotelIntro;
	private String hotelLocation;
	private int hotelNo;
	private int countReviews;
	private ArrayList<RoomInfo> roomList;
	private ArrayList<ServiceList> serList;
	private ArrayList<HotelReview> reviewList;
		
}
