### Car[] 사용해서 주차장관리
+ null 값의 비교,사용

##### 1. Car.java
```java
	package com.itwill04.array.car;
	public class Car {
		/*
		클래스의 구성요소
		   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
		   2. 생성자메쏘드
		   3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
		*/
		
		//1.멤버필드(변수)[속성]
		private String no;//차량번호
		private int inTime;//입차시간
		private int outTime;//출차시간
		private int fee;//주차요금
		
		//2. 생성자메쏘드
		public Car() {
			
		}
		public Car(String no, int inTime) {
			this.no = no;
			this.inTime = inTime;
		}
		public Car(String no, int inTime, int outTime, int fee) {
			this.no = no;
			this.inTime = inTime;
			this.outTime = outTime;
			this.fee = fee;
		}
		//3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
		/*
		 *  입차시데이타(번호,입차시간)대입
		 */
		public void setIpChaData(String no,int inTime) {
			/*
			this.no = no;
			this.inTime=inTime;
			*/
			this.setNo(no);
			this.setInTime(inTime);
		}
		
		/*
		 * 요금계산
		 */
		public void calculateFee() {
			this.fee  =(this.outTime-this.inTime)*1000;
		}
		
		public static void headerPrint() {
			System.out.println("-----------------------------------");
			System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
			System.out.println("-----------------------------------");
		}
		/*
		 * 차량정보출력
		 */
		public  void print() {
			System.out.printf("%7s %7d %9d %8d%n",this.no,this.inTime,this.outTime,this.fee);
			return;
		}
		//setter,getter
		/*
		 * 출차시간 대입
		 */
		public void setOutTime(int outTime) {
			this.outTime=outTime;
		}
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public int getInTime() {
			return inTime;
		}
		public void setInTime(int inTime) {
			this.inTime = inTime;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		public int getOutTime() {
			return outTime;
		}
	}
```  
##### 2. CarArrayMain.java
```java
	package com.itwill04.array.car;

	public class CarArrayMain {

		public static void main(String[] args) {
			//Car[] carArray=new Car[30];
			
			Car[] carArray= {
					null,null,new Car("5654", 8),null,null,
					new Car("3422", 12),null,null,null,null,
					null,null,null,null,new Car("7789", 11),
					new Car("1120", 10),null,null,null,null,
					null,new Car("2389", 9),null,null,null,
					null,null,null,null,new Car("5555", 6)
			};
			/*
			null.메쏘드() --> NullPointerException
			 */
			System.out.println("1.전체 차량출력");
			Car.headerPrint();
			
			System.out.println("2.전체주차구획수");
			
			System.out.println("3.남은주차구획수");
			
			
			System.out.println("4.입차 (차량번호 7777번 9시입차) ");
			/*
			 * 1.차량객체생성
			 * 2.빈자리찾아서대입
			 */
			System.out.println("5.차량번호 7789번  차한대 정보출력");
			
			System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
			
			System.out.println("7.2389번차량 12시 출차");
			
			/*
			 * 1. 2389번차량찾기
			 * 2. 출차
			 * 3. 영수증출력
			 * 4. 2389번차량 주차장에서 차량삭제
			 */
			carArray[21]=null;
			System.out.println("99. 2389번차량 출차후전체 차량출력");
			Car.headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null) {
					carArray[i].print();
				}
			}
			
		}

	}
```
