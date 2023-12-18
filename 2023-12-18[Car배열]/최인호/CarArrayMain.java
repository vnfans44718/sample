package com_12_17_student_array;

public class CarArrayMain {

	public static void main(String[] args) {

		Car[] carArray = { null, null, new Car("5654", 8), null, null, new Car("3422", 12), null, null, null, null,
				null, null, null, null, new Car("7789", 11), new Car("1120", 10), null, null, null, null, null,
				new Car("2389", 9), null, null, null, null, null, null, null, new Car("5555", 6) };

		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체주차구획수");
		System.out.println("전체 주차 구획수 >> " + carArray.length);

		System.out.println("3.남은주차구획수");
		int num = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				num++;
			}
		}
		System.out.println("남은 주차 구획수 >> " + num);

		System.out.println("4.입차");

		Car[] car = { new Car("7777", 9), new Car("8888", 10) };
		int j = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car[j];
				j++;
			}
			if (j == car.length)
				break;
		}
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo() == "7789") {
				carArray[i].print();
			}
		}
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() >= 10) {
				carArray[i].print();
			}
		}
		System.out.println("7.2389번차량 12시 출차");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo() == "2389") {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
			}
		}

		System.out.println("99. 2389번차량 출차후전체 차량출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo() == "2389") {
				carArray[i] = null;
				break;
			}
		}
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}

	}

}
