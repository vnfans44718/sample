package study;


public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int hakbin1 = 1; //학번
		String name1 = "김경호"; //이름
		int korean1 = 42; // 국어
		int english1 = 56; //
		int math1 = 78; // 수학
		int sum1; //총점
		double avg1; //평균
		String grade1; //평점

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		int hakbin2 = 2; //학번
		String name2 = "김경수"; //이름
		int korean2 = 45; // 국어
		int english2 = 53; // 영어
		int math2 = 76; // 수학
		int sum2; //총점
		double avg2; //평균
		String grade2; //평점

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (korean1 < 0 || korean1 > 100) {
			System.out.println("국어1 점수가 이상합니다");
			return;
		} else if (korean2 < 0 || korean2 > 100) {
			System.out.println("국어2 점수가 이상합니다");
			return;
		} else if (english1 < 0 || english1 > 100) {
			System.out.println("영어1 점수가 이상합니다");
			return;
		} else if (english2 < 0 || english2 > 100) {
			System.out.println("영어2 점수가 이상합니다");
			return;
		} else if (math1 < 0 || math1 > 100) {
			System.out.println("수학1 점수가 이상합니다");
			return;
		} else if (math2 < 0 || math2 > 100) {
			System.out.println("수학2 점수가 이상합니다");
			return;
		}

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		// 총점구하기
		sum1 = korean1 + english1 + math1;
		sum2 = korean2 + english2 + math2;

		// 평균구하기
		//avg1 = String.format("%.1f", sum1 / 3);
		//avg2 = String.format("%.1f", sum2 / 3);
		avg1 = sum1 / 3;
		avg2 = sum2 / 3;

		// 평점
		// 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59))
		if (avg1 >= 90 && avg1 <= 100) {
			grade1 = "A";
		} else if (avg1 >= 80 && avg1 < 90) {
			grade1 = "B";
		} else if (avg1 >= 70 && avg1 < 80) {
			grade1 = "C";
		} else if (avg1 >= 60 && avg1 < 70) {
			grade1 = "D";
		} else {
			grade1 = "F";
		}

		if (avg2 >= 90 && avg2 <= 100) {
			grade2 = "A";
		} else if (avg2 >= 80 && avg2 < 90) {
			grade2 = "B";
		} else if (avg2 >= 70 && avg2 < 80) {
			grade2 = "C";
		} else if (avg2 >= 60 && avg2 < 70) {
			grade2 = "D";
		} else {
			grade2 = "F";
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
		System.out.println("---------학생 성적출력-------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("------------------------------------------");
		System.out.printf("%d %s %d %d %d %d %.1f %s \n", hakbin1, name1, korean1, english1, math1, sum1, avg1, grade1);
		System.out.printf("%d %s %d %d %d %d %.1f %s", hakbin2, name2, korean2, english2, math2, sum2, avg2, grade2);

	}

}

