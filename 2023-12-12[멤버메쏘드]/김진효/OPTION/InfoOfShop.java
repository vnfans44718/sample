/*
 * 쇼핑몰 상품 정보를  
 */

package com.itwill01.option;

public class InfoOfShop {

	/*
	 * << 속성(멤버변수)   >> 판매자, 상품명, 평점, 주문수, 원산지, 할인율, 원래가격, 할인율이 반영된 가격 수량, 용량, 주문갯수
	 * << 기능(멤버메쏘드) >> 데이타입력, 할인율이 반영된 가격 계산, 출력
	 */

	// 멤버변수 선언
	String seller;
	String nameOfProduct;
	String grade;
	int numberOfReview;
	String origin;
	double discount;
	int price;
	int discountPrice;
	int volume;
	int quantityofOrder;

	// 멤버메쏘드 선언

	/*
	 * 데이터를 멤버 변수에 대입하는 메소드
	 */

	public void infoOfProduct(String seller, String nameOfProduct, String grade, int numberOfReview, String origin,
			double discount, int price, int volume, int quantityofOrder) {
		this.seller = seller;
		this.nameOfProduct = nameOfProduct;
		this.grade = grade;
		this.numberOfReview = numberOfReview;
		this.origin = origin;
		this.discount = discount;
		this.price = price;
		this.volume = volume;
		this.quantityofOrder = quantityofOrder;
	}
	
	public void calDiscountPrice() {
		this.discountPrice=(int) (this.price - (this.price * this.discount));
	} // 정수 반올림은 어떻게 해야하지....

	/*
	 * 출력메소드 
	 */
	
	public void headerPrint() {
		System.out.printf("쇼핑몰의 제품 1개\n");
		System.out.printf("\n");
	}
	public void infoPrint() {
		System.out.printf("판매자명: %s \n", this.seller);
		System.out.printf("상품명: %s \n",this.nameOfProduct);
		System.out.printf("평점: %s \n", this.grade);
		System.out.printf("후기수: %d개 \n",this.numberOfReview);
		System.out.printf("원산지: %s \n",this.origin);
		System.out.printf("할인율: %d%% \n",(int)(this.discount*100));
		System.out.printf("원래가격: %d원 \n",this.price);
		System.out.printf("가격(할인적용): %d원 \n",this.discountPrice);
		System.out.printf("용량: %s \n",this.origin);
		System.out.printf("주문개수: %d개 \n",this.quantityofOrder);
	}
}
