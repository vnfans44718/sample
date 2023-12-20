package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
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
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}
	public static void headPrint() {
		System.out.println("책번호\t책제목\t책분류\t책설명");
	}
	public void print() {
		System.out.println("\t\t\t\t\t\t"+no+"\t"+title+"\t"+genre+"\t"+detail);
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