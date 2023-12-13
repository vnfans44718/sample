package com.itwill.shop;

public class Cart extends ShoppingMallMain {

	int cartNo;
	int cartPrice;
	int cartQuantity;
	int cartTotal;

	public void cartInfo(int cartNo, int cartPrice, int cartQuantity, int cartTotal) {
		this.cartNo = cartNo;
		this.cartPrice = cartPrice;
		this.cartQuantity = cartQuantity;
		this.cartTotal = cartTotal;

	}

	public void print() {
		System.out.println("제품번호   제품가격   제품수량   합계금액");
	}

	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public int getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}

	public int getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public int getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}

}
