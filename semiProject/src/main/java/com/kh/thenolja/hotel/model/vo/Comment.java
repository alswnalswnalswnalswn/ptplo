package com.kh.thenolja.hotel.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @NoArgsConstructor
public class Comment {
	private int roomNo;
	private int reserNo;
	private String nickname;
	private String commentContent;
	private Date createDate;
	
}
