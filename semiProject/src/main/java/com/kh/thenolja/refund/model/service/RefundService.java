package com.kh.thenolja.refund.model.service;

import com.kh.thenolja.refund.model.vo.Refund;

public interface RefundService {

	Refund insertRefund(Refund refund, int reserNo);

	Refund updateRefund(Refund refund, int reserNo);
	
	

}
