package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */
		Dvd peo1 = new Dvd();
		Dvd peo2 = new Dvd();

		/*
		 * Dvd정보대입메쏘드호출
		 */
		peo1.dvdInfo(1, "악마를보았다", "공포");
		peo2.dvdInfo(2, "신세계", "느와르");
		/*
		 * Dvd정보출력메쏘드호출
		 */
		peo1.dvdHeadPrint();
		peo1.dvdPrint();
		peo2.dvdPrint();
	}

}