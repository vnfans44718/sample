package com.itwill01.field;
public class StudentMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
			Student st1;
			Student st2;
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
			st1 = new Student();
			st2 = new Student();
			
			st1.no = 1;
			st1.name = "김경호";
			st1.kor = 42;
			st1.eng = 56;
			st1.math = 78;
			
			st2.no = 2;
			st2.name = "김경수";
			st2.kor = 45;
			st2.eng = 53;
			st2.math = 76;
			
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
			st1.tot = st1.kor+st1.eng+st1.math;
			st1.avg = st1.tot/3.0;
			st2.tot = st2.kor+st2.eng+st2.math;
			st2.avg = st2.tot/3.0;
			
			if (st1.avg>=90) {
				st1.grade = 'A';
			}else if (st1.avg>=80) {
				st1.grade = 'B';
			}else if (st1.avg>=70) {
				st1.grade = 'C';
			}else if (st1.avg>=60) {
				st1.grade = 'D';
			}else {
				st1.grade = 'F';
			}
			
			if (st2.avg>=90) {
				st2.grade = 'A';
			}else if (st2.avg>=80) {
				st2.grade = 'B';
			}else if (st2.avg>=70) {
				st2.grade = 'C';
			}else if (st2.avg>=60) {
				st2.grade = 'D';
			}else {
				st2.grade = 'F';
			}
		/*
		 * 학생 데이타를 출력 2명
		 */
			System.out.printf("-------------------학생 성적출력---------------------%n");
			System.out.printf("%s %3s %4s %2s %2s %3s %3s %3s %3s\n ","학번","이름","국어","영어","수학","총점","평균","평점","석차");
			System.out.printf("%d %5s %4d %4d %3d %5d %6.1f %3s %5s\n",st1.no,st1.name,st1.kor,st1.eng,st1.math,st1.tot,st1.avg,st1.grade,st1.rank);
			System.out.printf("%2d %5s %4d %4d %3d %5d %6.1f %3s %5s\n",st2.no,st2.name,st2.kor,st2.eng,st2.math,st2.tot,st2.avg,st2.grade,st2.rank);
			System.out.printf("----------------------------------------------------%n");
		
	
	}
}