package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dvdMember = new DvdMember(1, "김경호", "010-0000-0000", null);

		/*
		 * Dvd객체생성
		 */
		Dvd dvd = new Dvd(1, "쇼생크탈출", "드라마");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdMember.setRentDvd(dvd);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdMember.print();

	}

}