package com.itwill03.포함.배열포함;

public class DvdMember {
	private int no;// 회원번호
	private String name;// 회원이름
	private String tel;// 전화번호
	private Dvd[] dvds;// 빌린dvd들[최대3개]

	public DvdMember() {

	}

	public DvdMember(int no, String name, String tel, Dvd[] dvds) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvds = dvds;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Dvd[] getDvds() {
		return dvds;
	}

	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}

	public void print() {
		System.out.println(no + "\t" + name + "\t" + tel + "\t");

	}
}