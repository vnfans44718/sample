### 학생성적을 학생객체의 멤버메쏘드를 사용해서 출력하세요
1 . Calculator 클래스에 메쏘드정의   
2 . CalculatorMain 클래스의 메인블록에서 Calculator객체 메쏘드호출해서 연산수행   
3 . Student 클래스에 멤버메쏘드 정의   
4 . StudentMemberMethodMain 클래스에서  Student 멤버메쏘드 호출   

##### 1. Calculator.java 
```java
	package com.itwill01.method;
	/*
	 * 4개의 멤버메쏘드를 가짐
	 */
	public class Calculator {
		/*
		 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
		 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
		 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
		 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
		 */
	}
```
##### 2. CalculatorMain.java 
```java
package com.itwill01.method;
public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		
	}
}
```
##### 3. Student.java 
```java
	package com.itwill01.method;

	/*
	  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 */
	public class Student {

		/*
		 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
		 */

		// 멤버변수 선언
		int no;
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		char grade;
		int rank;
		
		// 멤버메쏘드 선언
		/*
		 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
		 */
		
		/*
		 * 총점계산메쏘드
		 */
		
		/*
		 * 평균계산메쏘드
		 */
		
		/*
		 * 평점계산메쏘드
		 */
		
		/*
		 * 출력메쏘드
		 */

	}

```


##### 4. StudentMemberMethodMain.java 
```java
	package com.itwill01.method;

	public class StudentMemberMethodMain {
		public static void main(String[] args) {
			/*
			학생객체생성(3명)
			*/

			/*
			 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
			 */
			
			/*
			 학생총점계산 메쏘드 호출(3명)
			 학생평균계산 메쏘드 호출(3명)
			 학생평점계산 메쏘드 호출(3명)
			 */
			
			/*
			 * 학생데이타 출력메쏘드 호출(3명)
			 */
		}
	}
```


### 5.[OPTION]다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요[]

 1. 헬스장 강사
     - 키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당   입니다. 
     - 키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다.

 2. 음식점에 배달 주문이 들어왔습니다.
       ```
       주문 접수 번호 : 202011020003
       주문 핸드폰 번호 : 01023450001
       주문 집 주소 : 서울시 강남구 역삼동 111-333
       주문 날짜 : 20201102
       주문 시간 : 130258
       주문 가격 : 35000
       메뉴 번호 : 0003
      ```
  3. 쇼핑몰의 제품1개
 
      ![image](https://github.com/2023-12-JAVA-DEVELOPER-149/01.JAVA_FUNDMENTAL_PRACTICE/assets/75401545/4852a1d4-dad6-4d6d-aad7-54830046204a)

