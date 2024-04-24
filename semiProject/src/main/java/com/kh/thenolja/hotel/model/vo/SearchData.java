package com.kh.thenolja.hotel.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class SearchData {
	private String daterange;
	private String location;
	private int maxPeople;
	
	
}
