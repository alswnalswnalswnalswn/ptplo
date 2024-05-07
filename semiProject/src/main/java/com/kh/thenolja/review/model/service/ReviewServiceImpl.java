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
	
	@Override
	public Review selectReview(int reserNo) {
		return reviewRepository.selectReview(sqlSession, reserNo);
	}

	@Override
	public int reviewUpdate(Review review) {
		return reviewRepository.reviewUpdate(sqlSession, review);
	}

	@Override
	public int reviewDelete(int reserNo) {
		return reviewRepository.reviewDelete(sqlSession, reserNo);
	}

}
