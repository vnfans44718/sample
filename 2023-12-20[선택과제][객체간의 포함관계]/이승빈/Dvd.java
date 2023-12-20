package com.itwill03.포함.배열포함;

public class Dvd {
	
	private int no;			// DVD번호
	private String title;	// DVD제목
	private String genre;	// DVD장르
	
	public Dvd() {
		
	}
	
	public Dvd(int no, String title, String genre) {
	
		this.no = no;
		this.title = title;
		this.genre = genre;
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
	
	public static void headerPrint() {
		System.out.println("<< 빌린DVD 리스트 >>");
		System.out.println("DVD번호\t" + "\tDVD제목\t" + "\tDVD장르\t");
	}
	
	public void print() {
		System.out.println(no + "\t" + title + "\t\t" + genre);
	}
	
}
