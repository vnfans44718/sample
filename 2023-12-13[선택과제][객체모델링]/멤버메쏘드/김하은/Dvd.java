package com.itwill01.method;

public class Dvd {
	
	private int numOfdvd;
	private String titleOfdvd;
	private String genreOfdvd;
	
	public void inputDvd(int no, String title, String genre) {
		this.numOfdvd = no;
		this.titleOfdvd = title;
		this.genreOfdvd = genre;
	}
	
	public void headerPrint() {
		System.out.printf("------------------------------------\n");
		System.out.printf("%s %10s %10s \n","Dvd번호","Dvd타이틀","Dvd장르");
		System.out.printf("------------------------------------\n");
	}
	
	public void dataPrint() {
		System.out.printf("%7d %8s %8s \n",numOfdvd,titleOfdvd,genreOfdvd);
	}

	public int getNo() {
		return numOfdvd;
	}

	public void setNo(int no) {
		this.numOfdvd = no;
	}

	public String getTitle() {
		return titleOfdvd;
	}

	public void setTitle(String title) {
		this.titleOfdvd = title;
	}

	public String getGenre() {
		return genreOfdvd;
	}

	public void setGenre(String genre) {
		this.genreOfdvd = genre;
	}
	
	
}
