
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */

		int number1 = 1;
		String name1 = "홍길동";
		int kor1 = 82;
		int eng1 = 88;
		int math1 = 95;
		int total1 = kor1 + eng1 + math1;
		double ave1 = total1 / 3.0;
		char gar1;
		int ran1 = 0;
		
		int number2 = 2;
		String name2 = "정수빈";
		int kor2 = 90;
		int eng2 = 95;
		int math2 = 87;
		int total2 = kor2 + eng2 + math2;
		double ave2 = total2 / 3.0;
		char gar2;
		int ran2 = 0;

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (!(kor1 >= 0 && kor1 <= 100)) {
			System.out.println(kor1 + " 은 유효한점수가 아닙니다.");
		} else if (!(eng1 >= 0 && eng1 <= 100)) {
			System.out.println(eng1 + " 은 유효한점수가 아닙니다.");
		} else if (!(math1 >= 0 && math1 <= 100)) {
			System.out.println(math1 + " 은 유효한점수가 아닙니다.");
		}
		
		
		if (!(kor2 >= 0 && kor2 <= 100)) {
			System.out.println(kor2 + " 은 유효한점수가 아닙니다.");
		} else if (!(eng2 >= 0 && eng2 <= 100)) {
			System.out.println(eng2 + " 은 유효한점수가 아닙니다.");
		} else if (!(math2 >= 0 && math2 <= 100)) {
			System.out.println(math2 + " 은 유효한점수가 아닙니다.");
		}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		
		
		if (ave1 >=90) {
			gar1 = 'A';
		}else if (ave1 >=80) {
			gar1 = 'B';
		}else if (ave1 >=70) {
			gar1 = 'C';
		}else if(ave1>=60) {
			gar1 = 'D';
		}else {
			gar1 = 'F';
		}
		

		
		if (ave2 >=90) {
			gar2 = 'A';
		}else if (ave2 >=80) {
			gar2 = 'B';
		}else if (ave2 >=70) {
			gar2 = 'C';
		}else if(ave2>=60) {
			gar2 = 'D';
		}else {
			gar2 = 'F';
		}

/*
 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요
 */

System.out.println("--------------학생 성적 출력-----------------");
System.out.println("학번 "+""+"이름"+" "+"국어"+" "+"영어"+" "+"수학"+" "+"총점"+" "+"평균"+" "+"평점"+" "+"석차");
System.out.println("---------------------------------------------");
System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %4c %4d\n",number1,name1,kor1,eng1,math1,total1,ave1,gar1,ran1);
System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %4c %4d\n",number2,name2,kor2,eng2,math2,total2,ave2,gar2,ran1);
System.out.println("---------------------------------------------");

}

}
