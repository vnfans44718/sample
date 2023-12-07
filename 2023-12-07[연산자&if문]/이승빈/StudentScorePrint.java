
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 *   - 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int num1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;

		int num2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		num1 = 1;
		name1 = "김말이";
		kor1 = 82;
		eng1 = 92;
		math1 = 68;

		num2 = 2;
		name2 = "이치킨";
		kor2 = 93;
		eng2 = 89;
		math2 = 72;
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *    - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (kor1 >= 0 && kor1 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"국어\" 점수로 유효하지 않습니다.\n", name1);
			return;
		}
		if (eng1 >= 0 && eng1 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"영어\" 점수로 유효하지 않습니다.\n", name1);
			return;
		}
		if (math1 >= 0 && math1 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"수학\" 점수로 유효하지 않습니다.\n", name1);
			return;
		}

		if (kor2 >= 0 && kor2 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"국어\" 점수로 유효하지 않습니다.\n", name2);
			return;
		}
		if (eng2 >= 0 && eng2 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"영어\" 점수로 유효하지 않습니다.\n", name2);
			return;
		}
		if (math2 >= 0 && math2 <= 100) {
		} else {
			System.out.printf("이 점수는 %s 학생의 \"수학\" 점수로 유효하지 않습니다.\n", name2);
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		avg1 = tot1 / 3.0;
		grade1 = 'F';
		if (avg1 >= 90 && avg1 <= 100) {
			grade1 = 'A';
		} else if (avg1 >= 80 && avg1 < 90) {
			grade1 = 'B';
		} else if (avg1 >= 70 && avg1 < 80) {
			grade1 = 'C';
		} else if (avg1 >= 60 && avg1 < 70) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}
		rank1 = 0;

		tot2 = kor2 + eng2 + math2;
		avg2 = tot2 / 3.0;
		grade2 = 'F';
		if (avg2 >= 90 && avg2 <= 100) {
			grade2 = 'A';
		} else if (avg2 >= 80 && avg2 < 90) {
			grade2 = 'B';
		} else if (avg2 >= 70 && avg2 < 80) {
			grade2 = 'C';
		} else if (avg2 >= 60 && avg2 < 70) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		rank2 = 0;
		/*
		 * - 출력포맷
		 * - 평균은 소수점이하 첫째자리까지출력(반올림)
		 * - 석차는 구하지마세요
		 */
		System.out.println("# 학생 성적 출력 #");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("| 학번 |  이름  | 국어 | 영어 | 수학 |  총점  |  평균  | 평점 | 석차 |");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%4d %7s %5d %6d %6d %7d %9.1f %5c %6d \n", num1, name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
		System.out.printf("%4d %7s %5d %6d %6d %7d %9.1f %5c %6d \n", num2, name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
		System.out.println("----------------------------------------------------------------------");

	}

}
