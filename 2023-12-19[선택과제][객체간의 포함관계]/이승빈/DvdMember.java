package com.itwill03.포함;


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
	private int no;
	private String name;
	private String phoneNum;
	private Dvd rentDvd;
	
	public DvdMember() {
		
	}
	
	public DvdMember(int no, String name, String phoneNum, Dvd rentDvd) {
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.rentDvd = rentDvd;
	}

	public void memPrint() {
		System.out.printf("회원번호: %d\t 회원이름: %s\t 전화번호: %s\n", no, name, phoneNum);
		rentDvd.dvdPrint();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
}
