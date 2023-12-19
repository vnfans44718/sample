package com.itwill.shop;

public class ShoppingMallMain {

	public static void main(String[] args) {
		Member member = new Member();
		Product product1 = new Product();
		Product product2 = new Product();
		Order order1 = new Order();
		Cart cart1 = new Cart();
		Cart cart2 = new Cart();

		member.info(1, "이정후", "강남구 테헤란로");
		member.headerPrint();
		member.print();

		product1.headerPrint();
		product1.info(13, "야구  배트", 49900);
		product1.print();
		product2.info(47, "야구글러브", 139000);
		product2.print();

		cart1.headerPrint();
		cart1.info(product1.getTitle(), "배송준비중", 1, product1.getPrice());
		cart1.print();
		System.out.println();
		cart2.info(product2.getTitle(), "배송준비중", 1, product2.getPrice());
		cart2.print();
		cart1.infoTot(product1.getPrice() + product2.getPrice());
		cart1.printTot();

		order1.headerPrint();
		order1.info(1, "2023-12-13", product1.getPrice() + product2.getPrice(), member.getAddress());
		order1.print();

	}

}
