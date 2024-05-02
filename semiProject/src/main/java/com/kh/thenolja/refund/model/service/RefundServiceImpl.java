package com.kh.thenolja.refund.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.refund.model.dao.RefundRepository;
import com.kh.thenolja.refund.model.vo.Refund;
@Service
public class RefundServiceImpl implements RefundService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private RefundRepository refundRepository;

	@Override
	public Refund insertRefund(Refund refund, int reserNo) {
		if(refundRepository.insertRefund(sqlSession, refund) > 0) {
			refundRepository.deleteReser(sqlSession, reserNo);
		};
		return refundRepository.selectRefund(sqlSession, reserNo);
	}

}
