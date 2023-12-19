package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int no;
	private String title;
	private String genre;
	private String detail;
	
	public Book() {
		
	}

	public Book(int no, String title, String genre, String detail) {
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}
	
	public void dvdPrint() {
		System.out.printf("<< 빌린책 리스트 >>\n" + "책번호: %d\t 책제목: %s\t 책분류: %s\t 책설명: %s\n", no, title, genre, detail);
		System.out.println();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}