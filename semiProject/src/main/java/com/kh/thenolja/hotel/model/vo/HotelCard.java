package com.kh.thenolja.hotel.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class HotelCard {
	
	private String hotelName;
	private String hotelLocation;
	private String hotelCategory;
	private String hotelPath;
	private int hotelNo;
	private int roomPrice;
	
		
}
