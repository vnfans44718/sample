package reviewJava;

public class BMain {
//메인메소드 생성 
	public static void main(String[] args) {

	//B객체 생성 
	B b1 = new B();
	
	//B객체멤버변수2개(x,y)에 값 대입 
	char x = 'A';
	int y = 3;
	
	//B객체멤버변수2개의 값 출력 
	System.out.println("x의 값: "+x);
	System.out.println("y의 값: "+y);	
		
	//객체멤버메소드2개 호출(m1,m2) 
	b1.m1();
	b1.m2();
	
	}

}
