package com.itwill.shop;

public class Product {
	int productNo;
	String productTitle;
	int productPrice;

	public void productInfo(int productNo, String productTitle, int productPrice) {
		this.productNo = productNo;
		this.productTitle = productTitle;
		this.productPrice = productPrice;
	}

	public void print() {
		System.out.println("제품번호   제품이름   제품가격");
	}

	public void productPrint() {
		System.out.printf("%5d %9s %10d\n", getProductNo(), getProductTitle(), getProductPrice());
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

}
