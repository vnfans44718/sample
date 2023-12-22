package com.itwill03.포함.배열포함;

public class BookMember {
		
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private Book[] books;
	
	public BookMember() {
	}
	
	public BookMember(int memberNo, String memberName, String memberPhone) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	public BookMember(int memberNo, String memberName, String memberPhone, Book[] books) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.books = books;
	}

	public static void headerPrint() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("회원번호"+"\t"+"회원이름"+"\t"+"전화번호");
		System.out.println("------------------------------------------------------------------");
	}
	
	public void memberPrint() {
		System.out.print(memberNo+"\t"+"\t"+memberName+"\t"+"\t"+memberPhone);
		Book.bookheaderPrint();
		if (books == null || books.length == 0) {
			System.out.println("빌린 책이 없습니다");
			return;
		}
		for (int i=0; i < books.length; i++) {
			books[i].bookPrint();
		}
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	
}