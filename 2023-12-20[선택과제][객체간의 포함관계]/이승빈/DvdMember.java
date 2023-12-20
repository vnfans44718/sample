package com.itwill03.포함.배열포함;

public class DvdMember {
	
	private int no;			// 회원번호
	private String name;	// 회원이름
	private String tel;		// 전화번호
	private Dvd[] myDvds;		// 빌린dvd들[최대3개]
	
	public DvdMember() {
		
	}
	
	public DvdMember(int no, String name, String tel, Dvd[] myDvds) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.myDvds = myDvds;
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
	
	public Dvd[] getMyDvds() {
		return myDvds;
	}

	public void setMyDvds(Dvd[] myDvds) {
		this.myDvds = myDvds;
	}

	public void print() {
		System.out.printf("회원번호: %-8d 회원이름: %-8s 전화번호: %-8s%n", no, name, tel);
	}
	
}
