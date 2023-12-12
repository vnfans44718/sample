### 쇼핑몰의 업무흐름

- 온라인 쇼핑몰에 회원 로그인을 하고 쇼핑몰이 판매하고 있는 제품2개를 장바구니에담은 후에 주문을 한다


##### 1. 객체들을찾고 각객체의 객체의 속성도출[객체모델링]
	
	- 회원객체 
	    속성: 회원번호,회원이름...
     
	- 제품객체   
	    속성:  제품번호,제품가격...
     
	-  카트객체   
	    속성:  제품번호,제품가격...	    


##### 2. 객체를 프로그램에서 실제 사용할 수 있는 형태인 클래스(Class)로 구현[클래스정의]
```java

       package com.itwill.shop;
	public class Member{
		int no;
		int name
		int address;
		public void print(){}
	}
  
	package com.itwill.shop;
	public class Product {
		int no;
		int title;
		int price;
	
		public void print() {
	
		}
	}

   	package com.itwill.shop;
	public class Order {
		/*
		 * 주문번호
		 * 주문날짜
		 * 주문금액
		 * 배송지
		 * 
		 */

		public void print() {
	
		}
	}


..

```
##### 3. 정의된 클래스를 이용하여 메모리상에 객체(인스턴스)를 생성하고 객체의내용 대입후 출력수행[인스턴스 생성/사용 단계]
```java
	package com.itwill.shop;

	public class ShoppingMallMain {

		public static void main(String[] args) {
			/*
			 * 객체들생성
			  
			 */
			Member m1=new Member();
			Product p1=new Product();
			
			/*
			객체들의내용 대입
			*/
			
			
			/*
			 * 객체들정보출력
			 */
			/*
			m1.print();
			p1.print();
			*/
		}

	}
```


