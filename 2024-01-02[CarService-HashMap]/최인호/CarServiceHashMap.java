package com.itwill05.service.collection.car;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class CarServiceHashMap {
	
	private HashMap<String,Car> carMap;
	private int count;// 주차장 구획수

	public CarServiceHashMap() {
		carMap = new HashMap<String,Car>();
		count = 30;
	}

	public CarServiceHashMap(int count) {
		carMap = new HashMap<String,Car>();
		this.count = count;
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 
	 *   - 주차장이 만차이면 입차실패
	 */
	public boolean ipCha(Car inCar) {
		boolean isSuccess = false;
		if(carMap.containsKey(inCar.getNo())) {
			return isSuccess;
		}
		if(carMap.size()>=count) {
			return isSuccess;
		}
		carMap.put(inCar.getNo(), inCar);
		isSuccess=true;
		return isSuccess;
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		Car.headerPrint();
		Set<Entry<String, Car>> tempSet = carMap.entrySet();
		Iterator<Entry<String,Car>> carMapIterator = tempSet.iterator();
		while(carMapIterator.hasNext()) {	
			carMapIterator.next().getValue().print();
		}
	}

	/*
	 * 5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar =null;
		findCar=carMap.get(no);
		return findCar;
	}

	/*
	 * 6. 입차시간(8시이후)인자받아서 ArrayList(차객체배열) 참조변수반환
	 */
	public ArrayList<Car> findByInTime(int inTime) {
		ArrayList<Car> findCars = new ArrayList<Car>();
		Set<Entry<String, Car>> tempSet = carMap.entrySet();
		Iterator<Entry<String,Car>> carMapIterator = tempSet.iterator();
		while(carMapIterator.hasNext()) {
			Entry<String, Car> tempEntry = carMapIterator.next();
			if(tempEntry.getValue().getInTime()>inTime) {
				findCars.add(tempEntry.getValue());
			}
		}
		
		return findCars;
	}

	/*
	 * 7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차";
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		carMap.get(no).setOutTime(outTime);
		removeCar=carMap.get(no);
		carMap.get(no).calculateFee();
		
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
		return count-carMap.size();
	} 
	
}