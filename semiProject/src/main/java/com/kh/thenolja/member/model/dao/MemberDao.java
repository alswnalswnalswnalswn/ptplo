package com.kh.hw.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.hw.member.model.vo.Member;

public class MemberDao {

//------------------------ 회원가입 -------------------------------------
	
	public int insertMember(SqlSession sqlSession, Member member) {
		return sqlSession.insert("memberMapper.insertMember", member);
	}
	
//---------------------로그인
	
	public Member login(SqlSession sqlSession, Member member) {
		return sqlSession.selectOne("memberMapper.login", member);
	}

	
	
	
}
