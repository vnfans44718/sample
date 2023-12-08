public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		
		int num1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int sum1;
		double avg1;
		char grade1;
		int rank1;
		
		int num2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int sum2;
		double avg2;
		char grade2;
		int rank2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		num1=1;
		name1="남다연";
		kor1=92;
		eng1=96;
		math1=78;
		rank1=0;
		
		num2=2;
		name2="최예나";
		kor2=75;
		eng2=83;
		math2=96;
		rank2=0;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
			
		if (kor1>100 || kor1<0) {
			System.out.println(kor1+" 점은 유효한 점수가 아닙니다");
			return;
		}
		if (eng1>100 || eng1<0) {
			System.out.println(eng1+" 점은 유효한 점수가 아닙니다");
			return;
		}
		if (math1>100 || math1<0) {
			System.out.println(math1+" 점은 유효한 점수가 아닙니다");
			return;
		}
		if (kor2>100 || kor2<0) {
			System.out.println(kor2+" 점은 유효한 점수가 아닙니다");
			return;
		}
		if (eng2>100 || eng2<0) {
			System.out.println(eng1+" 점은 유효한 점수가 아닙니다");
			return;
		}
		if (math2>100 || math2<0) {
			System.out.println(math2+" 점은 유효한 점수가 아닙니다");
			return;
		} 
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		sum1=kor1+eng1+math1;
		avg1=sum1/3.0;
		
		sum2=kor2+eng2+math2;
		avg2=sum2/3.0;
		
		if (avg1>=90) {
			grade1='A';
		}else if(avg1>=80) {
			grade1='B';
		}else if(avg1>=70) {
			grade1='C';
		}else if(avg1>=60) {
			grade1='D';
		}else {
			grade1='F';
		}
		
		if (avg2>=90) {
			grade2='A';
		}else if(avg2>=80) {
			grade2='B';
		}else if(avg2>=70) {
			grade2='C';
		}else if(avg2>=60) {
			grade2='D';
		}else {
			grade2='F';
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
		
		System.out.println("--------------- 학생 성적 출력 ---------------");
		System.out.println("학번  이름  국어 영어 수학 총점 평균 평점 석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%4d %s  %d   %d   %d  %d  %.1f   %c    %d \n", 
				num1, name1, kor1, eng1, math1, sum1, avg1, grade1, rank1);
		System.out.printf("%4d %s  %d   %d   %d  %d  %.1f   %c    %d \n", 
				num2, name2, kor2, eng2, math2, sum2, avg2, grade2, rank2);
		System.out.println("----------------------------------------------");
		
	}

}


