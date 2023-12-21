package com.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */

		DvdMember u1 = new DvdMember();
//		DvdMember u2 = new DvdMember();
//		DvdMember u3 = new DvdMember();

		u1.setMemberNo(1);
		u1.setMemberName("일번이");
		u1.setMemberPhoneNumber(01000001111);
//		u1.setRentDvd(null);

		/*
		 * Dvd 객체생성
		 */

		Dvd[] d1 = { new Dvd(1, "알포인트", "공포") };
		Dvd[] d2 = { new Dvd(2, "범죄도시", "액션") };
		Dvd[] d3 = { new Dvd(3, "백두산", "재난") };

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd 객체참조변수를 회원의 멤버변수에대입
		 */

//		u1.setRentDvd(d1);
		u1.setRentDvd(d2);
		u1.setRentDvd(d3);

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		u1.print();
	}

}
