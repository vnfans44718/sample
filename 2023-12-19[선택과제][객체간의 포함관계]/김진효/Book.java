package itwill1103.포함;

public class Book {
	/*
	 * - 캡슐화하세요 private
	 * - 생성자를 정의하세요
	 * 
	 * <<기능>>
	 *   책정보출력
	 */

	// 속성 - 책번호, 책제목, 책분류, 책설명
	private int noOfBook;
	private String nameOfBook;
	private String categoryOfBook;
	private String descriptionOfBook;

	// 멤버변수를 이용할 생성자 만들기 alt + shift + s 하고 o
	public Book(int noOfBook, String nameOfBook, String categoryOfBook, String descriptionOfBook) {
		this.noOfBook = noOfBook;
		this.nameOfBook = nameOfBook;
		this.categoryOfBook = categoryOfBook;
		this.descriptionOfBook = descriptionOfBook;
	}

	// 출력 메소드
	public void print() {
		System.out.println("<<책 정보 출력>>");
		System.out.println("책번호: " + noOfBook);
		System.out.println("책제목: " + nameOfBook);
		System.out.println("책분류: " + categoryOfBook);
		System.out.println("책설명: " + descriptionOfBook);
	}

}