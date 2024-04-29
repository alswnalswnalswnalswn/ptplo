package com.kh.thenolja.hotel.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class SearchOptions {
	
	private int maxPeople;
	private String location;
	private String startDate;
	private String endDate;
	
}
