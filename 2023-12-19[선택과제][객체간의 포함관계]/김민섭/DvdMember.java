package com.포함;

public class DvdMember {

	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */

	/*
	<<기능>>
	  회원정보출력 	
	 */

	private int memberNo;
	private String memberName;
	private int memberPhoneNumber;
	private Dvd rentDvd;// 빌린dvd

	public DvdMember() {
		// TODO Auto-generated constructor stub
	}

	public DvdMember(int memberNo, String memberName, int memberPhoneNumber) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public DvdMember(int memberNo, String memberName, int memberPhoneNumber, Dvd rentDvd) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.rentDvd = rentDvd;
	}

	public void print() {
		System.out.printf("회원번호 : %d \t 회원이름 : %s \t 연락처 : %d \n", memberNo, memberName, memberPhoneNumber);
		rentDvd.print();
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

	public int getMemberPhoneNumber() {
		return memberPhoneNumber;
	}

	public void setMemberPhoneNumber(int memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public Dvd getRentDvd() {
		return this.rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}
