package com_12_19;

public class Book {

	private int no;
	private String title;
	private String genre;
	private String detail;

	public Book(int no, String title, String genre, String detail) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
		this.detail = detail;
	}

	public void print() {
		System.out.println("책번호 : " + no + "\t 책제목: " + title + "\t 책분류 : " + genre + "\t 책설명 : " + detail);
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