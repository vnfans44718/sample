package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */
		Dvd dvd = new Dvd();
		/*
		 * Dvd정보대입메쏘드호출
		 */
		dvd.myDvd(1, "타이타닉", "멜로/로맨스, 드라마");
		/*
		 * Dvd정보출력메쏘드호출
		 */
		dvd.headerPrint();
		dvd.print();
	}

}
