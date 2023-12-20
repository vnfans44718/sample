package com.itwill03.포함.배열포함;

public class Dvd {
	
	private int dvdNo;
	private String dvdTitle;
	private String dvdGenre;
	
	public Dvd() {		
	}

	public Dvd(int dvdNo, String dvdTitle, String dvdGenre) {
		this.dvdNo = dvdNo;
		this.dvdTitle = dvdTitle;
		this.dvdGenre = dvdGenre;
	}
	
	public void dvdPrint() {
		System.out.println("\t"+dvdNo+"\t"+dvdTitle+"\t"+dvdGenre);
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
