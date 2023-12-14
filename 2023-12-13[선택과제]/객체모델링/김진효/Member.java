package com.itwii.shop;

public class Member {
	String no;
	String name;
	String address;

	// 멤버 객체에 멤버변수를 대입하기 위한 메소드
	
	//	회원전화번호, 회원이름, 회원주소
	public void member(String no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}
	
	// 출력 메소드
	public void Print() {
		System.out.printf("회원전화번호: %s%n",no);
		System.out.printf("회원이름: %s%n",name);
		System.out.printf("회원주소: %s%n",address);
		System.out.println();
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
