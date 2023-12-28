package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findByNo(int no) {

		AcademyMember findAcademy = null;
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() == no) {
				findAcademy = academyMember;
				break;
			}
		}
		return findAcademy;
	}

	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {

		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				count++;
			}
		}
		AcademyMember[] findByName = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				findByName[j] = members[i];
				j++;
			}
		}
		return findByName;
	}

	/*
	* 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	* 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	* 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	*/

	public AcademyMember[] findByStudent() {
		AcademyMember[] students = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				students[j] = members[i];
				j++;
			}
		}
		return students;
	}

	public AcademyMember[] findByGangsa() {
		AcademyMember[] gangsas = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				gangsas[j] = members[i];
				j++;
			}
		}
		return gangsas;
	}

	public AcademyMember[] findByStaff() {
		AcademyMember[] staffs = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				staffs[j] = members[i];
				j++;
			}
		}
		return staffs;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */

	public AcademyMember[] findByJava() {
		AcademyMember[] javas = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) members[i];
				if (tempStudent.getBan().equals("자바")) {
					javas[j] = tempStudent;
					j++;
				}
			}
		}
		return javas;
	}

	public AcademyMember[] findBySale() {
		AcademyMember[] sales = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) members[i];
				if (tempStaff.getDepart().equals("영업")) {
					sales[j] = tempStaff;
					j++;
				}
			}
		}
		return sales;
	}

	public AcademyMember[] findByGangsaJava() {
		AcademyMember[] gangsaJava = new AcademyMember[members.length];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
				if (tempGangsa.getClass().equals("자바")) {
					gangsaJava[j] = tempGangsa;
					j++;
				}
			}
		}
		return gangsaJava;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}