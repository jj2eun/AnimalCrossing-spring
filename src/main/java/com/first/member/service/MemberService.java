package com.first.member.service;

import com.first.member.dto.MemberDto;

public interface MemberService {
	// ȸ������ ����
	public int register(MemberDto memberDto);
	// �α��� ����
	public int login(MemberDto memberDto);
	// ȸ������ ����
	public MemberDto memberUpdate(MemberDto memberDto);
	// ȸ��Ż�� ����
	public int memberDelete();
}
