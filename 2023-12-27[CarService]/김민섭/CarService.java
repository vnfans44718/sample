
/*
 * 주차장 업무를 실행할클래스
 * 		1.Car[] 을멤버변수로가진다.
 * 		2.Car객체들을 사용해서 업무실행(입차 출차,검색)
 */

package com.itwill05.service.account;

public class CarService {

	private Car[] carArray;

	public CarService() {
		carArray = new Car[30];
	}

	public CarService(int count) {
		carArray = new Car[count];
	}

	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public boolean ipCha(Car car) {
		boolean isEmpty = false;
		boolean isDuplicate = false;
		boolean isSuccess = false;
		/*
		 * 1.주차장만차인지체크
		 * 2.차량번호 중복체크
		 * 3.입차
		 */
		// * 1.주차장만차인지체크
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				isEmpty = true;
				break;
			}

		}
		if (!isEmpty) {
			return isEmpty;
		}

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals(car.getNo())) {
				isDuplicate = true;
				break;

			}
		}
		if (isDuplicate) {
			return !isDuplicate;
		}

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car;
				isSuccess = true;
				break;
			}
		}

		// * 2.차량번호 중복체크
//		for (int i = 0; i < carArray.length; i++) {
//			if (carArray[i].getNo().equals(car.getNo())) {
//				System.out.println("만차이거나 번호가중복되었습니다.");
//			}
//		}

		return isSuccess;

	}
	/*
	1. 전체차량출력
	2. 주차구획수반환
	3. 주차가능주차구획수반환
	4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차
	*/

	/*
	 * 6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차후 출차객체반환
	 */
	public Car chulCha(String no, int outTime) {
		Car outCar = null;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i].getNo().equals(no)) {
				carArray[i].setOutTime(outTime);
				outCar = carArray[i];
			}
		}
		return outCar;
	}

	/*
	5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	 */
	public Car[] findByInTime(int inTime) {
		Car[] findCars = null;
		for (int i = 0; i < findCars.length; i++) {
			if (carArray[i].getInTime() > inTime) {
				findCars = carArray;
			}
		}

		return findCars;
	}

	/*
	 * 4. 차량번호(2322번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar = null;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i].getNo().equals(no)) {
				findCar = carArray[i];
			}
		}
		return findCar;
	}

	/*
	 * 3. 주차가능주차구획수반환
	 */
	public int getAvailableParkingNumber() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				count++;
			}
		}
		return count;
	}

	/*
	2. 주차구획수반환
	 */
	public int getTotalParkingNumber() {
		return carArray.length;
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null)
				carArray[i].print();
		}
	}

}
