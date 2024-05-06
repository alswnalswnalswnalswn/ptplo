package com.kh.thenolja.review.model.service;

import java.util.List;

import com.kh.thenolja.review.model.vo.Review;

public interface ReviewService {

	int  reviewInsert(Review review);

	List<Review> selectReviewList(int hotelNo);
	
	

}
