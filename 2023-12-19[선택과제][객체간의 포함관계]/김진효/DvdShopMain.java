package itwill1103.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member1 = new DvdMember(1234, "김뇸뇸", "010-5647-7565");

		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(1111, "DVD - 리바운드", "국내");

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */

		member1.setRentDvd(dvd1);

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */

		member1.print();

	}

}