import javax.swing.DefaultListSelectionModel;

public class OperatorArithmatic {

	public static void main(String[] args) {
			int a=1;
			int b=2;
			
			int result = 0; 
			
			result = a + b;
			System.out.println(" a + b --> "+result);
			result = a - b;
			System.out.println(" a - b --> "+result);
			result = a * b;
			System.out.println(" a * b --> "+result);
			result = a / b; // ???
			System.out.println(" a / b --> "+result);
			result = a % b;
			System.out.println(" a % b --> "+result);
			
			/*
			 * 나머지연산자
			 */
			int number=13;
			result = number%4;// 0,1,2,3
			System.out.println("result변수값이 0이면 4의 배수"+result);
			
			int year=2023;
			result = year%4;
			System.out.println("2023 % 4   -->"+result);

			result = year%100;
			System.out.println("2023 % 100 -->"+result);
			
			result = year%400;
			System.out.println("2023 % 400 -->"+result);
			
			// 코드 이동 : alt키 + 방향키 
			
			System.out.println("----------문자연산----------");
			char ca ='A';
			char cz ='Z';
			
			int numberOfLlphabet = cz - ca ;
			System.out.println("알파벳대문자수:"+ numberOfLlphabet);
			int numberOfHangul= '힣'-'가'+1;
			System.out.println("한글글자수"+ numberOfHangul);
	
			char hangul1='가';
			System.out.println(hangul1);
			char hangul2='가'+2;
			System.out.println(hangul2);
			
			int kor,eng,math;
			
			kor=45;
			eng=89;
			math=78;
			
			int tot = kor+eng+math;
			double avg = tot/3.0;
			System.out.printf("%6d %6d %6d %d %6.2f \n",kor,eng,math,tot,avg);
			System.out.printf("%6d %6d %6d %d %6.2f \n",kor,eng,math,tot,avg);
			
	}

}
