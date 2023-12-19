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
	private Dvd rentDvd;// 빌린dvd

	public DvdMember() {

	}

	public DvdMember(int no, String name, String phoneNum, Dvd rentDvd) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.rentDvd = rentDvd;
	}

	public void print() {
		System.out.println("no = " + no + ", name = " + name + ", phoneNum = " + phoneNum + ", rentDvd = " + rentDvd);

	}

	public String toString() {
		return "DndMember [no = " + no + " name = " + name + " phoneNum = " + phoneNum + " renDvd = " + rentDvd + "]";
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