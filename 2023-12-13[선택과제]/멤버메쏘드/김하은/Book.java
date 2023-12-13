package com.itwill01.method;

public class Book {
	
	int numOfbook;
	String nameOfbook;
	String genreOfbook;
	String descriptionOfbook;
	
	public void inputBook(int no, String name, String category, String description) {
		this.numOfbook = no;
		this.nameOfbook = name;
		this.genreOfbook = category;
		this.descriptionOfbook = description;
	}
	
	public void headerPrint() {
		System.out.printf("-------------------------------------------------------------\n");
		System.out.printf("%s %15s %8s %17s \n","책번호","책이름","책분류","책설명");
		System.out.printf("-------------------------------------------------------------\n");
	}
	
	public void dataPrint() {
		System.out.printf("%6d %10s %7s %11s",numOfbook,nameOfbook,genreOfbook,descriptionOfbook);
	}

}
