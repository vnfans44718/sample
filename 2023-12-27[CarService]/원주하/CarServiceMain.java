package com.itwill05.service.array.car;

public class CarServiceMain {
	private static final String Car = null;

	public static void main(String[] args) {
		CarService carService = new CarService(65);

		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.ipCha(new Car("2344", 3));
		carService.ipCha(new Car("1221", 4));
		carService.ipCha(new Car("2345", 5));
		carService.ipCha(new Car("1212", 6));
		carService.ipCha(new Car("2322", 7));
		carService.ipCha(new Car("5436", 8));
		carService.ipCha(new Car("6672", 9));
		carService.ipCha(new Car("9876", 10));
		carService.ipCha(new Car("7899", 11));
		boolean isSuccess = carService.ipCha(new Car("2344", 10));
		if (!isSuccess) {
			System.out.println("만차이거나 번호가중복되었습니다.");
		}
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");

		System.out.println(carService.getTotalParkingNumber());
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");

		System.out.println(carService.getAvailableParkingNumber());
		System.out.println("4.CarService객체야 차량번호(2322번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car ac = carService.findByNo("2322");
		ac.print();

		System.out.println("5.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] ac1 = carService.findByInTime(8);
		for (int i = 0; i < ac1.length; i++) {
			if (ac1[i] instanceof Car) {
				ac1[i].print();
			}
		}

		System.out.println("6.CarService객체야 차량번호(1212번) 출차시간(12시)인자로줄께 출차시켜주고 출차차량참조변수반환해줘");
		Car ac2 = carService.chulCha("1212", 12);
		ac2.print();
		carService.print();

	}

}