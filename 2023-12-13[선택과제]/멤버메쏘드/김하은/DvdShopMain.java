package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {
		
		Dvd dvd1 = new Dvd();
		Dvd dvd2 = new Dvd();
		
		dvd1.inputDvd(1, "어바웃타임", "로맨스");
		dvd2.inputDvd(2, "엘리멘탈", "애니메이션");
		
		dvd1.headerPrint();
		dvd1.dataPrint();
		dvd2.dataPrint();

	}

}
