package com.kh.thenolja.hotel.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Hotel {
	private int hotelNo;
	private String hotelName;
	private String hotelPhone;
	private String hotelLocation; // 지역
	private String hotelAddress;  // 주소
	private String hotelDetail;   // 상세주소
	private String hotelCategory;
	private String hotelPath; // 숙소사진
	private String hotelIntro;
	private String hotelYN;
	private String hostName;
	
	
}
