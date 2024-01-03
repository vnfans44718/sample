package com.itwill05.service.collection.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CarServiceHashMap {

	private HashMap<String, Car> carMap;
	private int count;// 주차장 구획수

	public CarServiceHashMap() {
		carMap = new HashMap<String, Car>();
		count = 30;
	}

	public CarServiceHashMap(int count) {

		carMap = new HashMap<String, Car>();
		this.count = count;

	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 
	 *   - 주차장이 만차이면 입차실패
	 */
	public boolean ipCha(Car inCar) {
		boolean isSuccess = false;

		if (carMap.size() < count) {
			isSuccess = true;
		}

		carMap.put(inCar.getNo(), inCar);

		return isSuccess;
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		Set<Entry<String, Car>> carPrint = carMap.entrySet();
		for (Entry<String, Car> entry : carPrint) {
			String key = (String) entry.getKey();
			Car car = (Car) entry.getValue();
			car.print();
		}

	}

	/*
	 * 5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar = null;
		findCar = carMap.get(no);
		return findCar;
	}

	/*
	 * 6. 입차시간(8시이후)인자받아서 ArrayList(차객체배열) 참조변수반환
	 */
	public ArrayList<Car> findByInTime(int inTime) {
		ArrayList<Car> findCars = new ArrayList<Car>();

		Iterator<String> carNoIterator = carMap.keySet().iterator();
		while (carNoIterator.hasNext()) {
			String carNo = carNoIterator.next();
			Car tempCar = carMap.get(carNo);
			if (tempCar.getInTime() >= inTime) {
				findCars.add(tempCar);
			}
		}

		return findCars;
	}

	/*
	 * 7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차";
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar = null;

		carMap.get(no).setOutTime(outTime);
		carMap.get(no).calculateFee();
		removeCar = carMap.get(no);
		carMap.remove(no);

		return removeCar;
	}

	/*
	 * 2. 주차전체구획수반환 
	 */
	public int getParkingLotCount() {
		return this.count;
	}

	/*
	  3. 주차가능주차구획수반환 
	 */
	public int getAvailableParkingLotCount() {
		return count - carMap.size();
	}

}