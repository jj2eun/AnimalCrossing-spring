package com.first.member.dto;

import java.security.Timestamp;

public class MemberDto {
	private String userId;
	private String userPassword;
	private String userName;
	private String userNickname;
	private String userEmail;
	private String userZipcode;
	private String userAddress;
	private String userAddressDetail;
	private String memberLevel;
	private Timestamp registerDate;
	private int reportCount;
	private boolean isBlock;
	
	public MemberDto() {}
	
	
	public MemberDto(String userId, String userPassword, String userName, String userNickname, String userEmail,
			String userZipcode, String userAddress, String userAddressDetail, String memberLevel,
			Timestamp registerDate, int reportCount, boolean isBlock) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userNickname = userNickname;
		this.userEmail = userEmail;
		this.userZipcode = userZipcode;
		this.userAddress = userAddress;
		this.userAddressDetail = userAddressDetail;
		this.memberLevel = memberLevel;
		this.registerDate = registerDate;
		this.reportCount = reportCount;
		this.isBlock = isBlock;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddressDetail() {
		return userAddressDetail;
	}

	public void setUserAddressDetail(String userAddressDetail) {
		this.userAddressDetail = userAddressDetail;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}


	public int getReportCount() {
		return reportCount;
	}


	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}


	public boolean isBlock() {
		return isBlock;
	}


	public void setBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}


	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userNickname=" + userNickname + ", userEmail=" + userEmail + ", userZipcode=" + userZipcode
				+ ", userAddress=" + userAddress + ", userAddressDetail=" + userAddressDetail + ", memberLevel="
				+ memberLevel + ", registerDate=" + registerDate + ", reportCount=" + reportCount + ", isBlock="
				+ isBlock + "]";
	}

	
	
	
	
	
}
