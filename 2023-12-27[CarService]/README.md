## CarService객체사용 연습
   + CarServiceMain CarService 객체사용
   + CarServiceMain CarService 객체로 매개변수전달& 반환
      + Car.java
      + CarService.java
      + CarServiceMain.java  

#### 1 . CarService.java
```java

/*
 * 주차장 업무를 실행할클래스
 * 		1.Car[] 을멤버변수로가진다.
 * 		2.Car객체들을 사용해서 업무실행(입차 출차,검색)
 */
 
package com.itwill05.service.array.car;


public class CarService {
	
	private Car[] carArray;
	
	public CarService() {
		carArray=new Car[30];
	}
	public CarService(int count) {
		carArray=new Car[count];
	}
	
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public boolean ipCha(Car car) {
		boolean isSuccess=false;
		/*
		 * 1.주차장만차인지체크
		 * 2.차량번호 중복체크
		 * 3.입차
		 */
		// * 1.주차장만차인지체크
		
		// * 2.차량번호 중복체크
		
	
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
	public Car chulCha(String no,int outTime) {
		Car outCar=null;
		
		return outCar;
	}
	
	
	/*
	5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	 */
	public Car[] findByInTime(int inTime) {
		Car[] findCars=null;
		
		return findCars;
	}
	
	
	/*
	 * 4. 차량번호(2322번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar=null;
		
		return findCar;
	}
	
	/*
	 * 3. 주차가능주차구획수반환
	 */
	public int getAvailableParkingNumber() {
		int count=0;
		
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
			if(carArray[i]!=null) 
				carArray[i].print();
		}
	}
	
	
}


```
#### 2.CarServiceMain.java
```java
package com.itwill05.service.array.car;
public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService=new CarService(65);
		
		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.ipCha(new Car("2344",3));
		carService.ipCha(new Car("1221",4));
		carService.ipCha(new Car("2345",5));
		carService.ipCha(new Car("1212",6));
		carService.ipCha(new Car("2322",7));
		carService.ipCha(new Car("5436",8));
		carService.ipCha(new Car("6672",9));
		carService.ipCha(new Car("9876",10));
		carService.ipCha(new Car("7899",11));
		boolean isSuccess=carService.ipCha(new Car("2344",10));
		if(!isSuccess) {
			System.out.println("만차이거나 번호가중복되었습니다.");
		}
		System.out.println("1.CarService객체야 전체차량출력해줘");
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		System.out.println("4.CarService객체야 차량번호(2322번) 인자로줄께  차객체한대 참조변수반환해줘");
		System.out.println("5.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		System.out.println("6.CarService객체야 차량번호(1212번) 출차시간(12시)인자로줄께 출차시켜주고 출차차량참조변수반환해줘");
		carService.print();
	}

}


```
