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

	// 멤버변수 선언! ( DVD번호, DVD타이틀, DVD장르 )
	int numOfDvd;
	String titleOfDvd;
	String genreOfDvd;

	// 멤버메소드선언

	/* DVD정보를 멤버변수에 대입하기 위한 메소드 */

	public void dvdData(int numOfDvd, String titleOfDvd, String genreOfDvd) {
		this.numOfDvd = numOfDvd;
		this.titleOfDvd = titleOfDvd;
		this.genreOfDvd = genreOfDvd;
	}

	/* DVD정보 출력메소드 */
	public void topPrint() {
		System.out.printf("\t <<< DVD 정보 출력 >>>\n");
	}

	public void headerPrint() {
		System.out.println("----------------------------------------");
		System.out.printf("%5s %13s %11s \n", "DVD번호", "DVD타이틀", "DVD장르");
		System.out.println("----------------------------------------");
	}

	public void print() {
		System.out.printf("%5d %14s %5s", numOfDvd, titleOfDvd, genreOfDvd);
	}
}