package com.kh.thenolja.review.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
	public String reviewInsert(Review review, MultipartFile upfile, HttpSession session, int hotelNo) {
		
		if(!upfile.getOriginalFilename().equals("")) {
			
			review.setOriginName(upfile.getOriginalFilename());
			review.setChangeName(saveFile(upfile, session));
			review.setImgPath(review.getChangeName());
		}
		if(reviewService.reviewInsert(review) > 0) {
			
			return "redirect:list.review?hotelNo=" + hotelNo;
		} else {
			return "common/errorPage";
		}
	}
	
	public String saveFile(MultipartFile upfile, HttpSession session) {
		
		String originName = upfile.getOriginalFilename();
		
		String ext = originName.substring(originName.lastIndexOf("."));
		
		String currentTime = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		
		int ranNum = (int)Math.random() * 90000 + 10000;
		
		String changeName = currentTime + ranNum + ext;
		
		String savePath = session.getServletContext().getRealPath("/resources/reviewImage/");
		
			try {
				upfile.transferTo(new File(savePath + changeName));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}		
		return "resources/reviewImage/" + changeName;
	}
	
	@RequestMapping("list.review")
	public ModelAndView selectReviewList(int hotelNo, ModelAndView mv) {
		
		List<Review> reviewList = reviewService.selectReviewList(hotelNo);
//		mv.addObject("reviewList", reviewList);
//		mv.setViewName("review/reviewList");
		mv.addObject("reviewList", reviewList).setViewName("review/reviewList");
		return mv;
		
	}
	
	@PostMapping("reviewUpdate.do")
	public ModelAndView reviewUpdate(ModelAndView mv, Review review, MultipartFile upfile, HttpSession session, int reserNo) {
		review.setOriginName(upfile.getOriginalFilename());
		review.setChangeName(saveFile(upfile, session));
		review.setImgPath(review.getChangeName());
		
		if(reviewService.selectReview(reserNo) != null) {
			mv.addObject("review", reviewService.reviewUpdate(review)).setViewName("review/reviewList");
		} else {
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	@PostMapping("delete.review")
	public ModelAndView reviewDelete(ModelAndView mv, int reserNo) {
		
		if(reviewService.selectReview(reserNo) != null) {
		    reviewService.reviewDelete(reserNo);
			mv.addObject("alertMsg", "리뷰가 삭제되었습니다").setViewName("review/reviewList");
			
		} else {
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
