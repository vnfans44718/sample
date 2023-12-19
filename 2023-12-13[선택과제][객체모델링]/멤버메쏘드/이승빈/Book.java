package com.itwill01.method;

public class Book {
	/*
	 * <<속성>>
	 * 
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
	int no;
	String name;
	String category;
	String explain;

	public void setBookInfoData(int no, String name, String category, String expalain) {
		this.no = no;
		this.name = name;
		this.category = category;
		this.explain = expalain;
	}

	public void headerPrirnt() {
		System.out.printf("책 정보를 출력하세요.\n");
		System.out.println();
	}

	public void print() {
		System.out.printf("책번호: %d\n", no);
		System.out.printf("책이름: %s\n", name);
		System.out.printf("책분류: %s\n", category);
		System.out.printf("책설명: %s\n", explain);
	}

}