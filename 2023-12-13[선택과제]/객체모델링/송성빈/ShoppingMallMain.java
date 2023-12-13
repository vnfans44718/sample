package com.itwill.shop;

public class ShoppingMallMain {

	public static void main(String[] args) {

		Member mem1 = new Member();
		Product product1 = new Product();
		Cart cart1 = new Cart();
		Order order1 = new Order();

		mem1.setMemberNo(1);
		mem1.setMemberName("김경호");
		mem1.setMemberAddress("서울");

		mem1.print();
		mem1.memberPrint();
		System.out.println();

		product1.setProductNo(1);
		product1.setProductTitle("딸기");
		product1.setProductPrice(5000);

		product1.print();
		product1.productPrint();
		System.out.println();

		cart1.setCartNo(product1.getProductNo());
		cart1.setCartPrice(product1.getProductPrice());
		cart1.setCartQuantity(2);
		cart1.setCartTotal(product1.getProductPrice() * cart1.getCartQuantity());

		cart1.print();
		System.out.printf("%5d %11d %9d %11d\n", product1.getProductNo(), product1.getProductPrice(),
				cart1.getCartQuantity(), cart1.getCartTotal());
		System.out.println();

		order1.setOrderNo(mem1.getMemberNo());
		order1.setOrderDate("2023/12/13");
		order1.setOrderPrice(product1.getProductPrice() * cart1.getCartQuantity());
		order1.setOrderAddress(mem1.getMemberAddress());

		order1.print();
		order1.orderPrint();

	}

}
