package com.first.member.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.first.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Inject
	private SqlSessionTemplate sqlSession;
	
	// ȸ������
	@Override
	public int memberRegister(MemberDto memberDto) {
		return sqlSession.insert("member.register", memberDto);
	}

	// ���̵� �ߺ�üũ
	@Override
	public int memberIdCheck(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	// �α���
	@Override
	public int loginOk(MemberDto memberDto) {
		return sqlSession.selectOne("member.login", memberDto);
	}

	@Override
	public int memberUpdateOk(MemberDto memberDto) {	
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDeleteOk(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
