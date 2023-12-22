package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		
		DvdMember member1 = new DvdMember(109, "김초콜릿", "01012345678", null);
		DvdMember member2 = new DvdMember(285, "박마카롱", "01098765432", null);
		DvdMember member3 = new DvdMember(952, "최캐러멜", "01073510186", null);
		
		Dvd dvd1 = new Dvd(87, "여학교의 별", "일상/개그");
		Dvd dvd2 = new Dvd(10, "주토피아", "애니메이션");
		
		member1.setRentDvd(dvd1);
		member2.setRentDvd(dvd2);
		member3.setRentDvd(null);
		
		DvdMember.headerPrint();
		member1.memberPrint();
		member2.memberPrint();
		member3.memberPrint();
		
	}
}
