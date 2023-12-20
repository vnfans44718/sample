package com.itwill03.포함.배열포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember mem = new DvdMember(4186, "이디오", "010-1111-2222", null);
		
		/*
		 * Dvd들객체생성
		 */
		Dvd[] dvds = new Dvd[3];

		dvds[0] = new Dvd(101, "니모를 또 찾네", "애니메이션");
		dvds[1] = new Dvd(207, "아바타 36", "SF판타지");
		dvds[2] = new Dvd(355, "범죄도시 101", "범죄/액션");
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		mem.setMyDvds(dvds);
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		mem.print();
		Dvd.headerPrint();
		for (int i = 0; i < dvds.length; i++) {
			dvds[i].print();
		}
	}

}
