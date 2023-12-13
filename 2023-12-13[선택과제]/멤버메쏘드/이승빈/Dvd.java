package com.itwill01.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 * 
	 * <<기능>>
	 *   - Dvd정보대입
	 *   - Dvd정보출력
	 *   
	 */
	int no;
	String title;
	String genre;

	public void dvdInfoData(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	public void headerPrirnt() {
		System.out.printf("DVD 정보를 출력하세요.\n");
		System.out.println();
		System.out.printf("%s %8s %8s\n", "|번호|", "|타이틀|", "|장르|");
		System.out.printf("================================\n");
	}

	public void print() {
		System.out.printf("%5d %7s %8s\n", no, title, genre);
	}
	
}