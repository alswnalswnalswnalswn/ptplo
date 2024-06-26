package com.kh.thenolja.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thenolja.member.model.dao.MemberRepository;
import com.kh.thenolja.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Member login(Member member) {
		return memberRepository.login(sqlSession, member);
	}

	@Override
	public int update(Member member) {
		return 0;
	}

	@Override
	public int delete(Member member) {
		return 0;
	}

	@Override
	public int idCheck(String chekcId) {
		return 0;
	}
	
	
}
