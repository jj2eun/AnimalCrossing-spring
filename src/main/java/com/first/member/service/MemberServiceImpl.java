package com.first.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.member.dao.MemberDao;
import com.first.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;

	// ȸ������
	@Override
	public int register(MemberDto memberDto) {
		return memberDao.memberRegister(memberDto);
	}

	// �α���
	@Override
	public int login(MemberDto memberDto) {
		return memberDao.loginOk(memberDto);
	}

	// ȸ������
	@Override
	public MemberDto memberUpdate(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return null;
	}

	// ȸ��Ż��
	@Override
	public int memberDelete() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
