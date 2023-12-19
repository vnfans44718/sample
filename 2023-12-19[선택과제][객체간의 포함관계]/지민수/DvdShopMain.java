package com.itwill03.포함;

public class DvdShopMain {
	public static void main(String[] args) {

		DvdMember mem1 = new DvdMember(1, "유희관", "010-8877-9966", null);

		Dvd dvd1 = new Dvd(16, "스파이더맨", "판타지");

		mem1.setRentDvd(dvd1);

		mem1.headerPrint();
		mem1.print();
	}
}