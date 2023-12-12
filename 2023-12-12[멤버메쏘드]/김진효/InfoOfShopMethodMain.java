package com.itwill01.option;

public class InfoOfShopMethodMain {

	public static void main(String[] args) {
		// 주문 객체 생성 (1개)
		
		InfoOfShop orderOfShop = new InfoOfShop();
		
		// 주문 데이터 입력메소드 호출
		

		orderOfShop.infoOfProduct("SSG푸드마켓", "SSG옥종 한단딸기 500g", "★★★★(4점)", 12239, "국내산", 0.36, 21900, 500, 1);
		
		// 주문 데이터 중 할인가격이 반영된 가격 호출
		
		orderOfShop.calDiscountPrice();
		
		// 주문 데이터 출력메소드 호출
		
		orderOfShop.headerPrint();
		orderOfShop.infoPrint();

	}

}
