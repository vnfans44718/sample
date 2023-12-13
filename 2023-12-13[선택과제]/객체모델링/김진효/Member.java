package com.itwii.shop;

public class Member {
	String no;
	String name;
	String address;

	// 멤버 객체에 멤버변수를 대입하기 위한 메소드
	
	// 주문자 전화번호, 주문자 이름, 주문자 주소
	public void member(String no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
