package com.kh.thenolja.reservation.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Coupon {
	
	private int couponNo;
	private String couponContent;
	private Date couponDate;
	private String couponYN;
	private String couponCode;
	private int couponPercent;
	private int reMemNo;
	
	
	
	
	

}
