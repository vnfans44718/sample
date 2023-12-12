/*
 음식점에 배달 주문이 들어왔습니다.

주문 접수 번호 : 202011020003
주문 핸드폰 번호 : 01023450001
주문 집 주소 : 서울시 강남구 역삼동 111-333
주문 날짜 : 20201102
주문 시간 : 130258
주문 가격 : 35000
메뉴 번호 : 0003
 */

// 음식점에서 배달 주문 업무를 수행하기 위해 필요한 주문 객체를 만들기 위한 클래스

package com.itwill01.option;

public class FoodOrder {
	/*
	 * << 속성(멤버변수)   >>  주문접수번호, 주문핸드폰번호, 주문집주소, 주문날짜, 주문시간, 주문가격, 메뉴번호
	 * << 기능(멤버메쏘드) >>  주문 객체의 데이터 입력, 출력
	 */

	// 멤버변수 선언
	String number;
	int numberOfHp;
	String address;
	int date;
	int time;
	int price;
	double numberOfMenu;

	// 멤버메쏘드 선언

	/*
	 * 기본데이터를 멤버변수에 대입하는 메쏘드 
	 */

	public void orderData(String number, int numberOfHp, String address, int date, int time, int price,
			double numberOfMenu) {
		this.number = number;
		this.numberOfHp = numberOfHp;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.numberOfMenu = numberOfMenu;
	}

	/*
	 * 출력메쏘드 
	 */
	public void printHeader() {
		System.out.printf("%s \n", "음식점에 배달 주문이 들어왔습니다.");
	}

	public void printOrder() {
		System.out.printf("%-1s %s\n", "주문 접수 번호:", this.number);
		System.out.printf("%-1s %d\n", "주문 핸드폰 번호:", this.numberOfHp);
		System.out.printf("%-1s %s\n", "주문 집 주소:", this.address);
		System.out.printf("%-1s %d\n", "주문 날짜:", this.date);
		System.out.printf("%-1s %d\n", "주문 시간:", this.time);
		System.out.printf("%-1s %d%s \n", "주문 가격:", this.price, "원");
		System.out.printf("%-1s %04.0f \n", "메뉴 번호:", this.numberOfMenu);
	}
}
