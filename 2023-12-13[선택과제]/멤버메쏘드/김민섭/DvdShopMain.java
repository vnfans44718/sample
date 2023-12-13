package com.itwill01.Method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */

		/*
		 * Dvd정보대입메쏘드호출
		 */

		/*
		 * Dvd정보출력메쏘드호출
		 */

		Dvd d1 = new Dvd();
		Dvd d2 = new Dvd();
		Dvd d3 = new Dvd();
		Dvd d4 = new Dvd();

		d1.dvdInfo(1, "월드워Z", "Horror");
		d2.dvdInfo(2, "어벤져스", "Action");
		d3.dvdInfo(3, "리틀포레스트", "Drama");
		d4.dvdInfo(4, "Elemental", "Animation");

		d1.header();
		d1.getDvdNo();
		d1.setDvdNo(5);
		d1.print();
		d2.getDvdTitle();
		d2.setDvdTitle("강사님이 구워주신 코딩 CD");
		d2.print();
		d3.getDvdGenre();
		d3.setDvdGenre("everydayLife");
		d3.print();
	}

}
