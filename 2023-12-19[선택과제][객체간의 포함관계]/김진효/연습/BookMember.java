package itwill1103.포함;

public class BookMember {
	/*
	 * - 캡슐화 <<기능>> 회원정보출력
	 */

	// 속성 회원번호, 회원이름, 전화번호, 빌린책
	private int noOfMem;
	private String nameOfMem;
	private String HPOfMem;
	private Book book;

	// 멤버변수를 이용할 생성자 만들기 alt + shift + s 하고 o
	public BookMember(int noOfMem, String nameOfMem, String hPOfMem, Book book) {
		this.noOfMem = noOfMem;
		this.nameOfMem = nameOfMem;
		this.HPOfMem = hPOfMem;
		this.book = book;
	}

	// 책을 빌리지 않았을 경우의 생성자
	public BookMember(int noOfMem, String nameOfMem, String hPOfMem) {
		this.noOfMem = noOfMem;
		this.nameOfMem = nameOfMem;
		this.HPOfMem = hPOfMem;
	}

	// headerprint 출력 메소드
	public static void headerPrint() {
		System.out.println("<<회원 정보 출력>>");
	}

	// 출력메소드
	public void print() {
		System.out.println("회원 번호: " + noOfMem);
		System.out.println("회원 이름: " + nameOfMem);
		System.out.println("회원 전화번호: " + HPOfMem);
		System.out.println();
		Book.headerPrint();
		book.print();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}