package itwill1103.포함.배열포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember();
		/*
		 * Dvd들객체생성
		 */

		Dvd dvd1 = new Dvd(123, "리틀포레스트", "드라마");
		Dvd dvd2 = new Dvd(343, "언어의정원", "애니");
		Dvd dvd3 = new Dvd(566, "밀수", "범죄");
		Dvd dvd4 = new Dvd(889, "올뺴미", "역사");

		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		m1.rentDVD(dvd4, dvd2);

		m1.setNo(1234);
		m1.setName("김뇸뇸");
		m1.setTel("010-5466-8765");

		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */

		Dvd.headerPrint();
		m1.print();

	}

}