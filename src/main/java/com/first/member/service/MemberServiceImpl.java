package com.first.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.member.dao.MemberDao;
import com.first.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;

	// 회원가입
	@Override
	public int register(MemberDto memberDto) {
		return memberDao.memberRegister(memberDto);
	}

	// 로그인
	@Override
	public int login(MemberDto memberDto) {
		return memberDao.loginOk(memberDto);
	}

	// 회원수정
	@Override
	public MemberDto memberUpdate(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return null;
	}

	// 회원탈퇴
	@Override
	public int memberDelete() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
