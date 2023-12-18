package com.itwill04.array;

public class CarArrayMain {

	public static void main(String[] args) {
		// Car[] carArray=new Car[30];

		Car[] carArray = { null, null, new Car("5654", 8), null, null, new Car("3422", 12), null, null, null, null,
				null, null, null, null, new Car("7789", 11), new Car("1120", 10), null, null, null, null, null,
				new Car("2389", 9), null, null, null, null, null, null, null, new Car("5555", 6) };
		/*
		null.메쏘드() --> NullPointerException
		 */
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();

			}
		}

		System.out.println("2.전체주차구획수");
		System.out.println("전체주차구획수 : "+carArray.length);
		System.out.println("3.남은주차구획수");
		int park = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				park++;
			}

		}
		System.out.println("남은주차구획수 : "+park);

		System.out.println("4.입차 (차량번호 7777번 / 9시 입차)");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서대입
		 */
		Car car1 = new Car("7777", 9);
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car1;
				break;
			}

		}

		System.out.println("5.차량번호 7789번  차한대 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getNo().equals("7789")) {
					carArray[i].print();
				}
			}

		}
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getInTime() >= 10) {
					carArray[i].print();
				}
			}
		}
		System.out.println("7.2389번차량 12시 출차");

		/*
		 * 1. 2389번차량찾기 equals로 찾기(String)
		 * 2. 출차 (아웃타임 세팅 후 요금계산)
		 * 3. 영수증출력
		 * 4. 2389번차량 주차장에서 차량삭제 (null)
		 * carArray[21]=null;
		 */
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getNo().equals("2389")) {
					carArray[i].setOutTime(12);
					carArray[i].calculateFee();
					Car.headerPrint();
					carArray[i].print();
					carArray[i] = null;
					break;
				}
			}

		}

		System.out.println("9. 2389번차량 출차후전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}

	}

}
