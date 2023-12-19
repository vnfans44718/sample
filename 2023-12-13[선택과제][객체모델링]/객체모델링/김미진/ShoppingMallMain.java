package com.itwill.shop;

public class ShoppingMallMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.myInfo(1, "김미진", "abc@naver.com", "010-1234-5678", "경기도 용인시");

		Product product1 = new Product();
		product1.myProduct("케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트", 37000, "지니마스");
		
		Product product2 = new Product();
		product2.myProduct("트리.jpg", 1226, "(183cm) 미리메리크리스마스 트리 장식 15개, 전구 3m 포함", 78000, "지니마스");

		Cart cart1 = new Cart();
		cart1.myCart("케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트", "지니마스", 37000, 3500, 1,
				"12월 23일 도착예정");
		
		Cart cart2 = new Cart();
		cart2.myCart("트리.jpg", 1226, "(183cm) 미리메리크리스마스 트리 장식 15개, 전구 3m 포함", "지니마스", 78000, 3500, 1,
				"12월 23일 도착예정");

		Order order1 = new Order();
		order1.myOrder("김미진", "010-1234-5678", "경기도 용인시", "케이크.jpg", 1225, "(예약발송) 메리크리스마스 산타와 루돌프의 하루 2단 케이크 만들기 세트",
				"지니마스", 1, 37000, 3500, "12월 23일 도착예정", 37000, 3500, 0, 37000);

		Order order2 = new Order();
		order2.myOrder("김미진", "010-1234-5678", "경기도 용인시", "트리.jpg", 1225, "(183cm) 미리메리크리스마스 트리 장식 15개, 전구 3m 포함",
				"지니마스", 1, 78000, 3500, "12월 23일 도착예정", 78000, 3500, 0, 37000);
		
		
		System.out.println(">> 회원정보");
		member.headerPrint();
		member.print();
		System.out.println();
		System.out.println(">> 제품정보");
		product1.headerPrint();
		product1.print();
		product2.print();
		System.out.println();
		System.out.println(">> 장바구니");
		cart1.headerPrint();
		cart1.print();
		cart2.print();
		System.out.println();
		System.out.println(">> 주문정보");
		order1.headerPrint();
		order1.print();
		order2.print();

	}

}
