package com.itwill.shop;

public class Member {
	
	private int no;
	private String name;
	private String email;
	private String num;
	private String address;

	public void myInfo(int no, String name, String email, String num, String address) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.num = num;
		this.address = address;
	}

	public void headerPrint() {
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s %s %8s %11s %11s \n", "회원번호", "이름", "이메일", "연락처", "주소");
		System.out.println("--------------------------------------------------------------");
	}
	
	public void print() {
		System.out.printf("%4d %6s %14s %14s %8s \n", no, name, email, num, address);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
