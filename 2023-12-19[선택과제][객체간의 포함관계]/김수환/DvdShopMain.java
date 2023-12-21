package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member=new DvdMember(1, "김수환", "010-4996-2719", null);
				
		/*
		 * Dvd객체생성
		 */
		Dvd dvd=new Dvd(1, "디비디", "재밌는디비디");
		
		
		
		
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		member.setRentDvd(dvd);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		member.print();
		
	}

}