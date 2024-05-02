package com.kh.thenolja.refund.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.refund.model.vo.Refund;

@Repository
public class RefundRepository {

	public int insertRefund(SqlSessionTemplate sqlSession, Refund refund) {
		return sqlSession.insert("refundMapper.insertRefund", refund);
	}

	public int deleteReser(SqlSessionTemplate sqlSession, int reserNo) {
		return sqlSession.update("refundMapper.deleteReser", reserNo);
	}

	public Refund selectRefund(SqlSessionTemplate sqlSession, int reserNo) {
		return sqlSession.selectOne("refundMapper.selectRefund", reserNo);
	}

}
