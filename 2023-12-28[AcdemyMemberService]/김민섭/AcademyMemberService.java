package com.itwill05.service.account;

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
	public AcademyMember findMemberNo(int no) {
		AcademyMember findNo = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == no) {
				findNo = members[i];
			}
		}
		return findNo;
	}

	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findMemberName(String name) {
		int c = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				c++;
			}
		}
		AcademyMember[] findNames = new AcademyMember[c];
		for (int i = 0, j = 0; i < findNames.length; i++) {
			if (members[i].getName().equals(name)) {
				findNames[j] = members[i];
				j++;
			}
		}
		return findNames;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember findMemberAcademyStudent() {
		AcademyMember findStd = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				findStd = academyMember;
			}
		}
		return findStd;
	}

	public AcademyMember findMemberAcademyStaff() {
		AcademyMember findStf = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				findStf = academyMember;
			}
		}
		return findStf;
	}

	public AcademyMember findMemberAcademyGangsa() {
		AcademyMember findGang = null;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				findGang = academyMember;
			}
		}
		return findGang;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findMemberAcademyStudent(String ban) {
		int c = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent && ((AcademyStudent) academyMember).ban.equals(ban)) {
				c++;
			}
		}
		AcademyMember[] findASBan = new AcademyMember[c];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent && ((AcademyStudent) members[i]).ban.equals(ban)) {
				findASBan[j] = members[i];
				j++;
			}
		}
		return findASBan;
	}

	public AcademyMember[] findMemberAcademyStaff(String Depart) {
		int c = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff && ((AcademyStaff) academyMember).getDepart().equals(Depart)) {
				c++;
			}
		}
		AcademyMember[] findASDepart = new AcademyMember[c];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff && ((AcademyStaff) members[i]).getDepart().equals(Depart)) {
				findASDepart[j] = members[i];
				j++;
			}
		}
		return findASDepart;
	}

	public AcademyMember[] findMemberAcademyGangsa(String subject) {
		int c = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa
					&& ((AcademyGangsa) academyMember).getSubject().equals(subject)) {
				c++;
			}
		}
		AcademyMember[] findAGsubject = new AcademyMember[c];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa && ((AcademyGangsa) members[i]).subject.equals(subject)) {
				findAGsubject[j] = members[i];
				j++;
			}
		}
		return findAGsubject;
	}
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}
