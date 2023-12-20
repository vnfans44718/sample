package com.itwill03.포함;

public class DvdMember {
	
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private Dvd rentDvd;
	
	public DvdMember() {		
	}
	
	public DvdMember(int memberNo, String memberName, String memberPhone, Dvd rentDvd) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.rentDvd = rentDvd;
	}
	
	public static void headerPrint() {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("회원번호"+"\t"+"회원이름"+"\t"+"전화번호"+"\t"+"빌린dvd");
		System.out.println("------------------------------------------------------------------------------------");
	}

	public void memberPrint() {
		System.out.print(memberNo+"\t"+"\t"+memberName+"\t"+memberPhone);
		rentDvd.dvdPrint();
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

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}
