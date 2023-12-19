package com.itwill01.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	*/
	private int no;
	private String title;
	private String genre;
	/*
	 *  <<기능>>
	 *   - Dvd정보대입
	 *   - Dvd정보출력
	 */

	public void myDvd(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	public void headerPrint() {
		System.out.println("------------------------------------------------");
		System.out.printf("%s %10s %14s \n", "Dvd번호", "Dvd타이틀", "Dvd장르");
		System.out.println("------------------------------------------------");
	}

	public void print() {
		System.out.printf("%4d %11s %15s \n", no, title, genre);
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
