package com.kh.thenolja.hotel.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class HotelReview {
	
	private int hotelNo;
	private int roomNo;
	private int reserNo;
	private String reviewScore;
	private String reserName;
	private String reviewContent;
	private Date createDate;
	
		
}
