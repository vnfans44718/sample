package com.itwill03.포함.배열포함;

public class DvdShopMain {

	public static void main(String[] args) {
		
		DvdMember member1 = new DvdMember(109, "김초콜릿", "01012345678");
		DvdMember member2 = new DvdMember(285, "박마카롱", "0109875432", null);
		DvdMember member3 = new DvdMember(952, "최캐러멜", "01073510186", null);
		
		Dvd[] rentDvds1 = {
				new Dvd(87, "여학교의 별", "일상/개그"),
				new Dvd(10, "주토피아", "애니메이션"),
		};	
		
		Dvd[] rentDvds2 = {
				new Dvd(34, "어바웃 타임", "멜로/로맨스"),
				new Dvd(29, "헤어질 결심", "멜로/로맨스"),
				new Dvd(66, "엘리멘탈", "애니메이션"),
				new Dvd(53, "귀를 기울이면", "애니메이션"),
		};		
		
		member2.setRentDvds(rentDvds1);
		member3.setRentDvds(rentDvds2);
		
		DvdMember.headerPrint();
		member1.memberPrint();
		System.out.println();
		DvdMember.headerPrint();
		member2.memberPrint();
		System.out.println();
		DvdMember.headerPrint();
		member3.memberPrint();
	

	}
}
