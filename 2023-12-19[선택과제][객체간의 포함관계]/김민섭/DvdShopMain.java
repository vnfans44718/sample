package com.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */

		DvdMember u1 = new DvdMember(1, "일번이", 01012331232);

		/*
		 * Dvd 객체생성
		 */

		Dvd d1 = new Dvd(1, "알포인트", "공포");

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd 객체참조변수를 회원의 멤버변수에대입
		 */

		u1.setRentDvd(d1);

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */

		u1.print();

	}

}
