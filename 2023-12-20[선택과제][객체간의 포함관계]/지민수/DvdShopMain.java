package com.itwill03.포함.배열포함;

public class DvdShopMain {
	public static void main(String[] args) {

		DvdMember m1 = new DvdMember(1, "KIN", "010-0000-1111", null);

		Dvd[] dvds = { new Dvd(123, "영화1", "전쟁"),
						new Dvd(343, "영화2", "전쟁"),
						new Dvd(566, "영화3", "전쟁"),
						new Dvd(889, "영화4", "전쟁") };

		m1.setDvds(dvds);

		m1.print();
	}
}