package com.itwill03.포함;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	  번호
	  타이틀
	  쟝르
	 * 
	 * <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	private int no;
	private String title;
	private String genre;
	public Dvd() {
		
	}
	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	public void print() {
		System.out.println("번호\t타이틀\t장르");
		System.out.println(no+"\t"+title+"\t"+genre);
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
	
	
	
	
}