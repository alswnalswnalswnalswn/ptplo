package com.kh.thenolja.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.thenolja.member.model.vo.Member;

@Repository
public class MemberRepository {

//---------------------로그인
	
	public Member login(SqlSession sqlSession, Member member) {
		return sqlSession.selectOne("memberMapper.login", member);
	}
	

	
	
	
}
