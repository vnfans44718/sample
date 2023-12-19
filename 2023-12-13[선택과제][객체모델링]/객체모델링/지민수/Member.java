
package com.itwill.shop;

public class Member {
	// 회원번호 회원이름 회원집주소
	private int no;
	private String name;
	private String address;

	public void info(int no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}

	public void headerPrint() {
		System.out.println("---------------------------------------------");
		System.out.printf("%s %5s %15s\n", "회원번호", "이름", "집주소");
		System.out.println("---------------------------------------------");
	}

	public void print() {
		System.out.printf("%5d %8s %15s\n", this.no, this.name, this.address);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
