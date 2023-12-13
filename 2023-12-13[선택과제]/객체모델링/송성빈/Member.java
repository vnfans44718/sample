package com.itwill.shop;

public class Member {
	int memberNo;
	String memberName;
	String memberAddress;

	public void userInfo(int memberNo, String memberName, String memberAddress) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberAddress = memberAddress;

	}

	public void print() {
		System.out.println("회원번호   회원이름   회원주소");
	}

	public void memberPrint() {
		System.out.printf("%5d %9s %7s\n", getMemberNo(), getMemberName(), getMemberAddress());
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

}
