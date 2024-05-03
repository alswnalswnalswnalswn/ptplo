package com.kh.thenolja.review.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.kh.thenolja.common.model.vo.MyFileRenamePolicy;
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
	public ModelAndView reviewInsert(ModelAndView mv, Review review, int hotelNo, HttpRequest request) {
		
		if(ServletFileUpload.isMultipartContent(request)) {
			// System.out.println("sdfsdf");
			
			int maxSize = 1024 * 1024 * 10;
			
			ServletContext application = session.getServletContext();
			String savePath = application.getRealPath("/resources/reviewImage/");
			
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
		}
	}

}
