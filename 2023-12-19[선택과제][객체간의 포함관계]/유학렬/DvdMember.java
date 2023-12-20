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
	private int no;
	private String name;
	private int phone;
	private Dvd rentDvd; // 빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */

	public DvdMember() {

	}

	public DvdMember(int no, String name, int phone, Dvd rentDvd) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.rentDvd = rentDvd;
	}

	public void headerPrint() {
		System.out.println("---------------회원 정보 출력------------");
		System.out.printf("%s %s %s %s", "회원번호", "회원이름", "전화번호", "빌린 DVD");
	}

	public void print() {
		System.out.printf("%d %s %d", no, name, phone);
		rentDvd.print();
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}