package com.itwill03.포함.배열포함;

public class DvdMember {
	
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private Dvd[] rentDvds;
	
	public DvdMember() {		
	}
	
	public DvdMember(int memberNo, String memberName, String memberPhone) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	public DvdMember(int memberNo, String memberName, String memberPhone, Dvd[] rentDvds) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.rentDvds = rentDvds;
	}
	
	public static void headerPrint() {
		System.out.println("------------------------------------------------");
		System.out.println("회원번호"+"\t"+"회원이름"+"\t"+"전화번호");
		System.out.println("------------------------------------------------");
	}

	public void memberPrint() {
		System.out.print(memberNo+"\t"+"\t"+memberName+"\t"+memberPhone);	
		Dvd.dvdheaderPrint();
		if (rentDvds == null || rentDvds.length == 0) {
			System.out.println("빌린 DVD가 없습니다");
			return;
		}	
			if (rentDvds.length >= 3) {
					System.out.println("DVD는 최대 3개까지 빌릴 수 있습니다");
					return;
			}else {	
				for (int i=0; i<rentDvds.length; i++) {
					rentDvds[i].dvdPrint();	
				}
			}	  
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Dvd[] getRentDvds() {
		return rentDvds;
	}

	public void setRentDvds(Dvd[] rentDvds) {
		this.rentDvds = rentDvds;
	}	
}
	
