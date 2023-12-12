package com.itwill01.method;

public class StudentMemberMethodMain { 
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.no1(1);
		stu1.name1("가나다");
		stu1.kor1(90);
		stu1.eng1(95);
		stu1.math1(91);
		stu1.total1();
		stu1.avg1();
		stu1.grade();
		
		stu1.print();
		stu1.mainPrint();
		
		stu2.no1(2);
		stu2.name1("라마바");
		stu2.kor1(53);
		stu2.eng1(52);
		stu2.math1(60);
		stu2.total1();
		stu2.avg1();
		stu2.grade();
		stu2.mainPrint();
		
		stu3.no1(3);
		stu3.name1("아자차");
		stu3.kor1(70);
		stu3.eng1(90);
		stu3.math1(80);
		stu3.total1();
		stu3.avg1();
		stu3.grade();
		stu3.mainPrint();
		
		
		
	}
}
