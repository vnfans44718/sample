package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */

		Dvd dvd1 = new Dvd();

		/*
		 * Dvd정보대입메쏘드호출
		 */

		dvd1.setData(1111, "짱구는 못말려", "애니메이션");

		/*
		 * Dvd정보출력메쏘드호출
		 */
		dvd1.headerPrint();
		dvd1.print();

	}

}