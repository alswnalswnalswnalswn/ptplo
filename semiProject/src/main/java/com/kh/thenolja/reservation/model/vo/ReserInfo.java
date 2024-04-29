package com.kh.thenolja.reservation.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class ReserInfo {
	
	private String startDate;
	private String endDate;
	private int people;
	
	

}
