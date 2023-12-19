package com.itwill03.포함;

public class DvdMember {
	
	private int no;
	private String name;
	private String num;
	private Dvd rentDvd;// 빌린dvd
	
	public DvdMember() {

	}

	public DvdMember(int no, String name, String num, Dvd rentDvd) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
		this.rentDvd = rentDvd;
	}

	public static void headerPrint() {
		System.out.println("--------------------------------");
		System.out.println("회원번호 \t 회원이름 \t 전화번호 \t 빌린DVD");
		System.out.println("--------------------------------");
	}

	public void print() {
		System.out.println(no + "\t" + name + "\t" + num);
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}
