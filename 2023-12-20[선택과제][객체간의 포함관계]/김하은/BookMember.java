package com.itwill03.포함;

public class BookMember {
		
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private Book book;
	
	public BookMember() {
	}
	
	public static void headerPrint() {
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("회원번호"+"\t"+"회원이름"+"\t"+"전화번호"+"\t"+"빌린책");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
	
	
	public BookMember(int memberNo, String memberName, String memberPhone, Book book) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.book = book;
	}

	public void memberPrint() {
		System.out.print(memberNo+"\t"+"\t"+memberName+"\t"+"\t"+memberPhone);
		book.bookPrint();
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
