package com.kh.thenolja.hotel.model.vo;

import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Event {
	private int eventNo;
	private String eventTitle;
	private String eventContent;
	private String eventImg;
	private Date createDate;
	
		
}
