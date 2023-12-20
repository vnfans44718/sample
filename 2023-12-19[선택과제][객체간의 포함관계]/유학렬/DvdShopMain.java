package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member = new DvdMember();

		/*
		 * Dvd객체생성
		 */
		Dvd rentDvd = new Dvd(1, "짱구", "애니메이션");

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		member.setName("유학렬");
		member.setNo(1);
		member.setPhone(01011111111);
		member.setRentDvd(rentDvd);

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		member.headerPrint();
		member.print();

	}

}