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
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	public void dvdPrint() {
		System.out.printf("<< 빌린DVD 리스트 >>\n" + "DVD번호: %d\t DVD제목: %s\t DVD장르: %s\n", no, title, genre);
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
	
	
	
	
	
	
	
	
	
	

	
	
	
}
