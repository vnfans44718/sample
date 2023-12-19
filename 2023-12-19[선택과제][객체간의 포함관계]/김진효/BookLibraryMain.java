package itwill1103.포함;

public class BookLibraryMain {
	public static void main(String[] args) {

		/*
		 * 책객체생성
		 */
		Book[] book = { new Book(1111, "트렌드코리아2024", "경제/경영", "청룡을 타고 비상하는 2024를 기원하며!"),
				new Book(2222, "도둑맞은 집중력", "교양", "집중력 위기의 시대, 삶의 주도권을 되찾는 법"),
				new Book(3333, "모순", "소설", "인생은 살아가면서 탐구하는 것!") };

		/*
		 * 회원객체생성
		 */

		BookMember member = new BookMember(1234, "김자바", "010-5656-2434");

		/*
		 * 회원이 책들 대여
		 * 
		 * 책 객체 참조변수를 회원의 멤버변수에대입
		 */
		for (int i = 0; i < book.length; i++) {
			member.setBook(book[i]);
		}

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		BookMember.headerPrint();
		member.print();
		Book.headerPrint();
		for (int i = 0; i < book.length; i++) {
			book[i].print();
		}
	}
}