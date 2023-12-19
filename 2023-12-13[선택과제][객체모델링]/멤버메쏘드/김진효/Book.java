package com.itwill01.method;

public class Book {
	/*
	
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   
	 *   - 책정보출력
	 *   - 책정보대입
	 *   
	 */

	// 멤버변수선언
	int numberOfBook;
	String nameOfBook;
	String category;
	String explanation;

	// 멤버 메소드 선언

	/* 책 정보를 멤버변수에 대입하기 위한 메소드 */
	public void bookData(int numberOfBook, String nameOfBook, String category, String explanation) {
		this.numberOfBook = numberOfBook;
		this.nameOfBook = nameOfBook;
		this.category = category;
		this.explanation = explanation;
	}

	/* 출력 메소드 */

	public void headerPrint() {
		System.out.printf(" << 책 정보 출력 >>\n");
	}

	public void print() {
		System.out.printf("책번호: %d \n", numberOfBook);
		System.out.printf("책제목: %s \n", nameOfBook);
		System.out.printf("책분류: %s \n", category);
		System.out.printf("책설명: %s \n", explanation);
	}

}