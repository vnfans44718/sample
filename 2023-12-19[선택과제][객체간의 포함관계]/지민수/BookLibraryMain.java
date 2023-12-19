package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {

		BookMember mem1 = new BookMember(3, "갑각류", "010-7777-8888", null);

		Book book1 = new Book(14, "12가지 인생의 법칙", "자기계발", "혼돈의 해독제");

		mem1.setRentBook(book1);

		mem1.headPrint();
		mem1.print();

	}

}
