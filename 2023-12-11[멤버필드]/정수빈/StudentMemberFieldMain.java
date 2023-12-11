package com.itwill00.variable;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		
		Student stu1;
		stu1 = new Student();
		
		stu1.number1 = 1;
		stu1.name1="김경호";
		stu1.kor1=42;
		stu1.eng1=56;    
		stu1.math1=78;  
		stu1.total1=(stu1.kor1+stu1.eng1+stu1.math1);  
	    stu1.ave1=(stu1.total1 / 3.0);  
	    stu1.gar1='F';               
	    stu1.ran1=0;               
		
	    Student stu2;
		stu2 = new Student();
		
		stu2.number2 = 2;
		stu2.name2="김경수";
		stu2.kor2=45;
		stu2.eng2=53;    
		stu2.math2=76;  
		stu2.total2=(stu2.kor2+stu2.eng2+stu2.math2);  
	    stu2.ave2=(stu2.total2 / 3.0);  
	    stu2.gar2='F';               
	    stu2.ran2=0;               
		
	    /*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
	    
	    if (stu1.ave1 >=90) {
	    	stu1.gar1 = 'A';
		}else if (stu1.ave1 >=80) {
			stu1.gar1 = 'B';
		}else if (stu1.ave1 >=70) {
			stu1.gar1 = 'C';
		}else if(stu1.ave1 >=60) {
			stu1.gar1 = 'D';
		}else {
			stu1.gar1 = 'F';
		}
	    
	    
	    if (stu2.ave2 >=90) {
	    	stu2.gar2 = 'A';
		}else if (stu2.ave2 >=80) {
			stu2.gar2 = 'B';
		}else if (stu2.ave2 >=70) {
			stu2.gar2 = 'C';
		}else if(stu2.ave2 >=60) {
			stu2.gar2 = 'D';
		}else {
			stu2.gar2 = 'F';
		}
		

		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
			System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
			System.out.printf("-----------------------------------------------%n");
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu1.number1,stu1.name1,stu1.kor1,stu1.eng1,stu1.math1,stu1.total1,stu1.ave1,stu1.gar1,stu1.ran1 );
			System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",stu2.number2,stu2.name2,stu2.kor2,stu2.eng2,stu2.math2,stu2.total2,stu2.ave2,stu2.gar2,stu2.ran2 );
	}

}