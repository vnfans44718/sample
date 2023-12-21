package com.포함;

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

	private int bookNo;
	private String bookname;
	private String Genre;
	private String bookExplanation;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNo, String bookname, String genre, String bookExplanation) {
		super();
		this.bookNo = bookNo;
		this.bookname = bookname;
		Genre = genre;
		this.bookExplanation = bookExplanation;
	}

	public void headPrint() {
		System.out.println(" <<< 책번호 \t 책제목 \t 책분류 \t 책설명 >>>");
	}

	public void print() {
		System.out.printf(" %10d, %10s, %10s, %10s\n", bookNo, bookname, Genre, bookExplanation);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getBookExplanation() {
		return bookExplanation;
	}

	public void setBookExplanation(String bookExplanation) {
		this.bookExplanation = bookExplanation;
	}

}
