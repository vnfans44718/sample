package com.itwill01.Method;

public class Shopping {

	String brandName, deliveryAddress, productName, origin, seller;
	int quantity, price, discount, cardBonus;
	double preference;

	public void want(String brandName, String seller, String productName, double preference, String origin,
			int discount, int price, int cardBonus, String deliveryAddress, int quantity) {
		this.brandName = brandName;
		this.seller = seller;
		this.productName = productName;
		this.preference = preference;
		this.origin = origin;
		this.discount = discount;
		this.price = price;
		this.cardBonus = cardBonus;
		this.deliveryAddress = deliveryAddress;
		this.quantity = quantity;

	}

	public void print() {
		System.out.println("딸기그림딸기그림딸기그림\t브랜드 : " + this.brandName);
		System.out.println("딸기그림딸기그림딸기그림\t판매자 : " + this.seller);
		System.out.println("딸기그림딸기그림딸기그림\t상품명 : " + this.productName);
		System.out.println("딸기그림딸기그림딸기그림\t선호도 : " + this.preference);
		System.out.println("딸기그림딸기그림딸기그림\t원산지 : " + this.origin);
		System.out.println("딸기그림딸기그림딸기그림\t할인 : " + this.discount);
		System.out.println("딸기그림딸기그림딸기그림\t가격 : " + this.price);
		System.out.println("딸기그림딸기그림딸기그림\t카드할인 : " + this.cardBonus);
		System.out.println("\t\t\t\t배송지 : " + this.deliveryAddress);
		System.out.println("\t\t\t\t수량 :  - " + this.quantity + " + ");
		System.out.printf("\t\t\t\t합계 = %d\n",
				(this.price - (this.price * this.discount) / 100 - (this.price * this.cardBonus) / 100)
						* this.quantity);
		System.out.println();
		System.out.println();
	}

}
