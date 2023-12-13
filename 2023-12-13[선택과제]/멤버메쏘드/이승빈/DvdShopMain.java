package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * Dvd객체생성
		 */
		Dvd cd1 = new Dvd();
		Dvd cd2 = new Dvd();

		/*
		 * Dvd정보대입메쏘드호출
		 */
		cd1.dvdInfoData(2344, "범죄도시", "범죄,액션");
		cd2.dvdInfoData(3531, "토이스토리", "애니메이션");

		/*
		 * Dvd정보출력메쏘드호출
		 */
		cd1.headerPrirnt();
		cd1.print();
		cd2.print();
	}

}