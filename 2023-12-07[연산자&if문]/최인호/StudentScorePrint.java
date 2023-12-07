
public class StudentScorePrint {
	public static void main(String[] args) {

		int num1, num2;
		String name1, name2;
		int kor1, eng1, math1, total1;
		int kor2, eng2, math2, total2;
		double avg1, avg2;
		char grade1, grade2;

		num1 = 1;
		name1 = "김경호";
		kor1 = 76;
		eng1 = 56;
		math1 = 92;

		num2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;

		if (!((kor1 >= 0 && kor1 <= 100) && (eng1 >= 0 && eng1 <= 100) && (math1 >= 0) && math1 <= 100)) {
			System.out.println("1번 학생의 점수가 유효한 점수가 아닙니다.");
			return;
		}
		if (!((kor2 >= 0 && kor2 <= 100) && (eng2 >= 0 && eng2 <= 100) && (math2 >= 0) && math2 <= 100)) {
			System.out.println("2번 학생의 점수가 유효한 점수가 아닙니다.");
			return;
		}

		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;

		avg1 = total1 / 3.0;
		avg2 = total2 / 3.0;

		if (avg1 >= 90) {
			grade1 = 'A';
		} else if (avg1 >= 80) {
			grade1 = 'B';
		} else if (avg1 >= 70) {
			grade1 = 'C';
		} else if (avg1 >= 60) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}

		if (avg2 >= 90) {
			grade2 = 'A';
		} else if (avg2 >= 80) {
			grade2 = 'B';
		} else if (avg2 >= 70) {
			grade2 = 'C';
		} else if (avg2 >= 60) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c  0\n", num1, name1, kor1, eng1, math1, total1, avg1,
				grade1);
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c  0\n", num2, name2, kor2, eng2, math2, total2, avg2,
				grade2);
		System.out.println("-----------------------------------------------");
	}
}
