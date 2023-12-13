package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */

		Dvd infoOfDvd = new Dvd();

		/*
		 * Dvd정보대입메쏘드호출
		 */

		infoOfDvd.dvdData(2559355, "[DVD]리틀 포레스트", "드라마");

		/*
		 * Dvd정보출력메쏘드호출
		 */

		infoOfDvd.topPrint();
		infoOfDvd.headerPrint();
		infoOfDvd.print();
	}

}