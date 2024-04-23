package com.kh.thenolja.member.model.service;

import com.kh.thenolja.member.model.vo.Member;

public interface MemberService {
	
	Member login(Member member);
	
	int update(Member member);
	
	int delete(Member member);
	
	
	int idCheck(String chekcId);

}
