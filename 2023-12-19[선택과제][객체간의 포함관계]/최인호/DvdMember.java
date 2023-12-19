package com_12_19;

public class DvdMember {

	private int no;
	private String name;
	private String phoneNumber;
	private Dvd[] rentDvd;

	public void print() {
		System.out.print("회원번호 : " + no + "  전화번호 : " + phoneNumber + "  대여한 DVD : ");
		for (int i = 0; i < rentDvd.length; i++) {
			System.out.print("[" + rentDvd[i].getTitle() + "]");
		}
	}

	public DvdMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Dvd[] getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd[] rentDvd) {
		this.rentDvd = rentDvd;
	}
}