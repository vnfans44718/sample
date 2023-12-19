package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {

		Dvd dvd1 = new Dvd();
		Dvd dvd2 = new Dvd();

		dvd1.infoDvd(1, "서울의 봄", "드라마");
		dvd2.infoDvd(2, "반지의 제왕", "판타지");

		dvd1.headerPrint();
		dvd1.Print();
		dvd2.Print();
	}

}
