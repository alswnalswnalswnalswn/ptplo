package com.kh.thenolja.review.model.vo;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class Review {
	
	private int reserNo;
	private String imgPath;
	private String reviewContent;
	private String score;
	private Date createDate;
	private String reviewYN;
	private String nickName;
    private int fileNo;
    private int refBno;
    private String originName;
    private String changeName;
    private String filePath;
}
