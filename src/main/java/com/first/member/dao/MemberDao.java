package com.first.member.dao;

import com.first.member.dto.MemberDto;

public interface MemberDao {
	// ȸ�����
	public int memberRegister(MemberDto memberDto);
	// ���̵� �ߺ�üũ
	public int memberIdCheck(String id);
	// �α���
	public int loginOk(MemberDto memberDto);
	// ȸ������
	public int memberUpdateOk(MemberDto memberDto);
	// ȸ��Ż��
	public int memberDeleteOk(MemberDto memberDto);

}
