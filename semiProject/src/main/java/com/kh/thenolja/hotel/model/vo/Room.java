package com.kh.thenolja.hotel.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Room {
	private int roomNo;
	private int hotelNo;
	private int roomNum;
	private int roomPrice;
	private int maxPeople;
	private String roomName;
	private String checkInTime;
	private String checkOutTime;
	private int roomImgNo;
	private String roomImgPath;
	private String roomYN;
	private int roomImg;
	
	
}
