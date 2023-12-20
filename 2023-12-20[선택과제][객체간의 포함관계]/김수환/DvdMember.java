package com.itwill03.포함.배열포함;

public class DvdMember {
	private int no;// 회원번호
	private String name;// 회원이름
	private String tel;// 전화번호
	private Dvd[] dvds;// 빌린dvd들[최대3개]

	public DvdMember() {

	}

	public DvdMember(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
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
		if(dvds.length>3) {
			System.out.println("최대 대여갯수를 초과하였습니다");
		}
	}

	public void print() {
		System.out.println(no + "\t" + name + "\t" + tel + "\t");
		System.out.println("빌린 DVD목록 ");
		for (Dvd dvd : dvds) {
			dvd.print();
		}
		
	}
}