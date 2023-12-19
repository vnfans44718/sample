package com.itwill01.Method;

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
	private int dvdNo;
	private String dvdTitle;
	private String dvdGenre;

	public void dvdInfo(int dvdNo, String dvdTitle, String dvdGenre) {
		this.dvdNo = dvdNo;
		this.dvdTitle = dvdTitle;
		this.dvdGenre = dvdGenre;
	}

	public void header() {
		System.out.printf("%s %8s %13s\n", "번호", "이름", "장르");
	}

	public void print() {
		System.out.printf("  %d	%s	%s\n", this.dvdNo, this.dvdTitle, this.dvdGenre);
	}

	public int getDvdNo() {
		return dvdNo;
	}

	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdGenre() {
		return dvdGenre;
	}

	public void setDvdGenre(String dvdGenre) {
		this.dvdGenre = dvdGenre;
	}

}
