package com.itwill03.포함.배열포함;

public class DvdShopMain {

	public static void main(String[] args) {
		
		DvdMember member1 = new DvdMember(109, "김초콜릿", "01012345678", null);
		
		Dvd[] rentDvds = new Dvd[4];
		rentDvds[0] = new Dvd(87, "여학교의 별", "일상/개그");
		rentDvds[1] = new Dvd(10, "주토피아", "애니메이션");
		rentDvds[2] = new Dvd(34, "어바웃 타임", "멜로/로맨스");
		rentDvds[3] = new Dvd(29, "헤어질 결심", "멜로/로맨스");
		
		member1.setRentDvds(rentDvds);
		
		DvdMember.headerPrint();
		member1.memberPrint();

	}
}
