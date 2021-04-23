package com.first.member.dao;

import com.first.member.dto.MemberDto;

public interface MemberDao {
	// 회원등록
	public int memberRegister(MemberDto memberDto);
	// 아이디 중복체크
	public int memberIdCheck(String id);
	// 로그인
	public int loginOk(MemberDto memberDto);
	// 회원수정
	public int memberUpdateOk(MemberDto memberDto);
	// 회원탈퇴
	public int memberDeleteOk(MemberDto memberDto);

}
