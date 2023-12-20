package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember mem1 = new DvdMember(1357, "이영화", "010-1234-5678", null);
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(148, "니모를 찾아서", "애니메이션");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		mem1.setRentDvd(dvd1);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		mem1.memPrint();
	}

}
