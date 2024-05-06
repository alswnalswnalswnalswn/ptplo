package com.kh.thenolja.review.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.review.model.dao.ReviewRepository;
import com.kh.thenolja.review.model.vo.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public int reviewInsert(Review review) {
		return reviewRepository.reviewInsert(sqlSession, review);
	}

	@Override
	public List<Review> selectReviewList(int hotelNo) {
		return reviewRepository.selectReviewList(sqlSession, hotelNo);
	}

}
