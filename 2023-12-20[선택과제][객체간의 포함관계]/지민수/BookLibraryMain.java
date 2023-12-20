package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {

		BookMember mem1 = new BookMember(1, "IMM", "010-0000-0000", null);

		Book[] books = { new Book(46372, "책제목1", "문학", "좋은책1"), 
						new Book(46372, "책제목2", "문학", "좋은책2")

		};

		mem1.setBooks(books);

		mem1.print();

	}

}
