package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember();
		m1.setNo(123);
		m1.setName("김경호");
		m1.setTel("02345678");
		/*
		 * Dvd들객체생성
		 */
		Dvd dvd1 = new Dvd(123, "영화1", "전쟁");
		Dvd dvd2 = new Dvd(343, "영화2", "전쟁");
		Dvd dvd3 = new Dvd(566, "영화3", "전쟁");
		Dvd dvd4 = new Dvd(889, "영화4", "전쟁");

		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 */

		Dvd[] Dvds = { dvd1, dvd2, null, null };
		m1.rentDvds(Dvds);

		/*
		* Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */

		m1.setDvds(Dvds);

		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 *
		 */
		m1.print();

	}

}