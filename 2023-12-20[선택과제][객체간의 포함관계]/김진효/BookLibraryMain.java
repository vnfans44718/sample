package itwill1103.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember1 = new BookMember();
		BookMember bookMember2 = new BookMember();
		/*
		 * 책객체들생성
		 */

		Book[] book1 = { new Book(46372, "파과", "소설", "구병모 장편소설"), new Book(32345, "아가미", "소설", "구병모 장편소설") };
		Book[] book2 = { new Book(23564, "정의란 무엇인가", "인문", "인문베스트셀러24"), new Book(54355, "공정하다는 착각", "인문", "인문베스트셀러42") };

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */

		bookMember1.setNo(1234);
		bookMember1.setName("김냠냠");
		bookMember1.setPhoneNumber("010-5463-6354");
		bookMember1.setBooks(book1);
		bookMember2.setNo(4567);
		bookMember2.setName("김뇸뇸");
		bookMember2.setPhoneNumber("010-3453-4256");
		bookMember2.setBooks(book2);

		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember1.print();
		bookMember2.print();

	}
}
