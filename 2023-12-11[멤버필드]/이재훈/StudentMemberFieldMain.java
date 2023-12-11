
public class StudentMemberFieldMain {
	public static void main(String[] args) {
		
		Student student1,student2;
		
		student1 = new Student();
		student2 = new Student();
		
student1.no1 = 1;
student1.name1 = "김경호";
student1.kor1 = 42;
student1.eng1 = 56;
student1.mth1 = 78;
student1.tot1 = (student1.kor1 + student1.eng1 + student1.mth1);
student1.avg1 = (student1.tot1 / 3.0);
student1.grade1 = 'A';

student2.no2 = 2;
student2.name2 = "김경수";
student2.kor2 = 45;
student2.eng2 = 53;
student2.mth2 = 76;
student2.tot2 = (student2.kor2 + student2.eng2 + student2.mth2);
student2.avg2 = (student2.tot2 / 3.0);
student2.grade2 = 'A';

System.out.printf("-------------학생 성적출력---------------\n");
System.out.printf("%s %3s %3s %s %s %s %s %s%n","학번","이름","국어","영어","수학","총점","평균","평점");
System.out.printf("------------------------------------------\n");
System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c%n",student1.no1, student1.name1, student1.kor1, student1.eng1, student1.mth1, student1.tot1, student1.avg1, student1.grade1);
System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c%n",student2.no2, student2.name2, student2.kor2, student2.eng2, student2.mth2, student2.tot2, student2.avg2, student2.grade2);
		
return;
		
	}

}
