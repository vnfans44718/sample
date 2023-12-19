package com.itwill03.포함;

public class BookMember {

	private int no;
	private String name;
	private String num;
	private Book rentBook;

	public BookMember() {
	}

	public BookMember(int no, String name, String num, Book rentBook) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
		this.rentBook = rentBook;
	}

	public static void headPrint() {
		System.out.println("----------------------------------------");
		System.out.println("회원번호\t 회원이름\t 전화번호\t 빌린책");
		System.out.println("----------------------------------------");
	}

	public void print() {
		System.out.print(no + "\t" + name + "\t" + num + "\t");
		rentBook.print();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Book getRentBook() {
		return rentBook;
	}

	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}

}
