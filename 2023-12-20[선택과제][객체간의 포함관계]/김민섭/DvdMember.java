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
	private Dvd rentDvd[] = new Dvd[3];// 빌린dvd

	public DvdMember() {
	}

	public DvdMember(int memberNo, String memberName, int memberPhoneNumber) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
	}

	public DvdMember(int memberNo, String memberName, int memberPhoneNumber, Dvd[] rentDvd) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.rentDvd = rentDvd;
	}

	public void print() {
		System.out.printf("회원번호 : %d \t 회원이름 : %s \t 연락처 : %d \n", memberNo, memberName, memberPhoneNumber);
		for (int i = 0; i < this.rentDvd.length; i++) {
			if (this.rentDvd[i] != null) {
				this.rentDvd[i].print();
			}
			if (i == this.rentDvd.length - 1 && this.rentDvd[i] != null) {
				System.out.println("\t\t*최대 대출 수량입니다.*");
			}
		}
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

	public Dvd[] getRentDvd() {

		return this.rentDvd;
	}

	public void setRentDvd(Dvd[] rentDvd) {
		for (int i = 0; i < this.rentDvd.length; i++) {
			if (this.rentDvd[i] == null) {
				this.rentDvd[i] = rentDvd[0];

				break;
			}
		}
	}
}
