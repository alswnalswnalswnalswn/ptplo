package com.kh.thenolja.review.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.review.model.vo.Review;

@Repository
public class ReviewRepository {

	public int reviewInsert(SqlSessionTemplate sqlSession, Review review) {
		return sqlSession.insert("reviewMapper.reviewInsert", review);
	}

	public List<Review> selectReviewList(SqlSessionTemplate sqlSession, int hotelNo) {
		return sqlSession.selectList("reviewMapper.selectReviewList", hotelNo);
	}

	public Review selectReview(SqlSessionTemplate sqlSession, int reserNo) {
		return sqlSession.selectOne("reviewMapper.selectReview", reserNo);
	}

	public int reviewUpdate(SqlSessionTemplate sqlSession, Review review) {
		return sqlSession.update("reviewMapper.reviewUpdate", review);
	}

	public int reviewDelete(SqlSessionTemplate sqlSession, int reserNo) {
		return sqlSession.update("reviewMapper.reviewDelete", reserNo);
	}

}
