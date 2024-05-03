package com.kh.thenolja.refund.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Refund {
	
	private int reserNo;
	private int refundPrice;
	private String accNo;
	private String refundName;
	private String bankName;
	

}
