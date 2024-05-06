package com.kh.thenolja.review.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.kh.thenolja.reservation.model.vo.Coupon;
import com.kh.thenolja.review.model.service.ReviewService;
import com.kh.thenolja.review.model.vo.Review;
@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("review.insert")
	public String insertReview() {
		return "review/insertReview";
	}
	
	@PostMapping("reviewInsert.do")
	public String reviewInsert(Review review, MultipartFile upfile) {
		
		if(!upfile.getOriginalFilename().equals("")) {
			
			review.setOriginName(upfile.getOriginalFilename());
			review.setChangeName(saveFile(upfile));
			
		}
		if(reviewService.reviewInsert(review) > 0) {
			
			return "redirect:list.review";
		} else {
			return "common/errorPage";
		}
	}
	@RequestMapping("list.review")
	public String selectReviewList(int hotelNo) {
		List<Review> reviewList = reviewService.selectReviewList(hotelNo)
			return new Gson().toJson(reviewList);
		
	}
}
