package com.first.member.service;

import com.first.member.dto.MemberDto;

public interface MemberService {
	// 회원가입 서비스
	public int register(MemberDto memberDto);
	// 로그인 서비스
	public int login(MemberDto memberDto);
	// 회원수정 서비스
	public MemberDto memberUpdate(MemberDto memberDto);
	// 회원탈퇴 서비스
	public int memberDelete();
}
