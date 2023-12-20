package com.itwill03.포함.배열포함;

public class BookMember {

	private int no;
	private String name;
	private String phoneNumber;
	private Book[] books;

	public BookMember() {

	}

	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
	}

	public void print() {
		System.out.println(no + "\t" + name + "\t" + phoneNumber + "\t");
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
