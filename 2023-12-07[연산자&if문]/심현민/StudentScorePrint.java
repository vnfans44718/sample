
public class StudentScorePrint {

	public static void main(String[] args) {
		
		int number = 1;
		String name = "가나다";
		char rank = '0';	
		int languageScore = 80;
		int englishScore = 80;
		int mathScore = 81;
		int totalScore = (languageScore + mathScore + englishScore);
		double avg = (totalScore / 3);
		char grade = '0';
		char grade2 = '0';
		
		int number2 = 2;
		String name2 = "라마바";
		int languageScore2 = 90;
		int englishScore2 = 90;
		int mathScore2 = 67;
		int totalScore2 = (languageScore2 + mathScore2 + englishScore2);
		double avg2 = (totalScore2 / 3);
		
		
		if (languageScore > 100 || englishScore > 100 || mathScore > 100) {
			System.out.println("100점을 초과할수 없습니다");
			return;
		}
		
		if (languageScore2 > 100 || englishScore2 > 100 || mathScore2 > 100) {
			System.out.println("100점을 초과할수 없습니다");
			return;
		}
		
		
		if(avg >= 90 && avg < 100) {
			grade = 'A';
		}
		else if (avg >= 80 && avg < 90) {
			grade = 'B';
		}
		else if (avg >= 70 && avg < 80) {
			grade = 'C';
		
		}
		else {
			grade = 'F';
		}
		
		if(avg2 >= 90 && avg2 < 100) {
			grade2 = 'A';
		}
		else if (avg2 >= 80 && avg2 < 90) {
			grade2 = 'B';
		}
		else if (avg2 >= 70 && avg2 < 80) {
			grade2 = 'C';
		}
		else {
			grade2 = 'F';
		}
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름  영어  수학  총점  평균  평점  석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c   %c\n",number,name,languageScore,englishScore,mathScore,totalScore,avg,grade,rank);
		System.out.printf("%d   %s   %d   %d   %d   %d   %.1f   %c   %c\n",number2,name2,languageScore2,englishScore2,mathScore2,totalScore2,avg2,grade2,rank);
		System.out.println("-----------------------------------------------");
	}

}
