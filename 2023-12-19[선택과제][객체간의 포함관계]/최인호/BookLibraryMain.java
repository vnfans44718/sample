package com_12_19;

public class BookLibraryMain {
	public static void main(String[] args) {

		Book[] books = { new Book(1, "해리포터", "판타지", "마법사들의 이야기"),
				new Book(2, "아바타2", "판타지", "신비로운 판도라 행성의 광활한 바다를 배경으로 하는 《아바타》의 후속작") };
		BookMember bm1 = new BookMember(1, "최인호", "010-1234-5678");

		bm1.setBook(books);

		bm1.print();
	}
}