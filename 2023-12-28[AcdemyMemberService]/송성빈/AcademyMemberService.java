package com.itwill05.service.array.academy;

import com.itwill04.array.academy.AcademyGangsa;
import com.itwill04.array.academy.AcademyMember;
import com.itwill04.array.academy.AcademyStaff;
import com.itwill04.array.academy.AcademyStudent;

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
	public AcademyMember findByNo() {
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() == 1) {
				return academyMember;
			}
		}
		return null;
	}

	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals("KIM")) {
				count++;
			}
		}
		AcademyMember[] findMember = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i].getName().equals("KIM")) {
				findMember[j] = members[i];
				j++;
			}
		}
		return findMember;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByStudent() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				count++;
			}
		}
		AcademyMember[] findStudent = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				findStudent[j] = members[i];
				j++;
			}
		}
		return findStudent;
	}

	public AcademyMember[] findByStaff() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				count++;
			}
		}
		AcademyMember[] findStaff = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				findStaff[j] = members[i];
				j++;
			}
		}
		return findStaff;
	}

	public AcademyMember[] findByGangsa() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				count++;
			}
		}
		AcademyMember[] findGangsa = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				findGangsa[j] = members[i];
				j++;
			}
		}
		return findGangsa;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findByBan() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				AcademyStudent getStudent = (AcademyStudent) academyMember;
				String getBan = getStudent.getBan();
				if (getBan.equals("자바")) {
					count++;
				}
			}
		}
		AcademyMember[] findBan = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent getStudent = (AcademyStudent) members[i];
				String getBan = getStudent.getBan();
				if (getBan.equals("자바")) {
					findBan[j] = members[i];
					j++;
				}
			}
		}
		return findBan;
	}

	public AcademyMember[] findByDepart() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				AcademyStaff getStaff = (AcademyStaff) academyMember;
				String getDepart = getStaff.getDepart();
				if (getDepart.equals("영업")) {
					count++;
				}
			}
		}
		AcademyMember[] findDepart = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff getStaff = (AcademyStaff) members[i];
				String getDepart = getStaff.getDepart();
				if (getDepart.equals("영업")) {
					findDepart[j] = members[i];
					j++;
				}
			}
		}
		return findDepart;
	}

	public AcademyMember[] findBySubject() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				AcademyGangsa getGangsa = (AcademyGangsa) academyMember;
				String getSubject = getGangsa.getSubject();
				if (getSubject.equals("자바")) {
					count++;
				}
			}
		}
		AcademyMember[] findSubject = new AcademyMember[count];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa getGangsa = (AcademyGangsa) members[i];
				String getSubject = getGangsa.getSubject();
				if (getSubject.equals("자바")) {
					findSubject[j] = members[i];
					j++;
				}
			}
		}
		return findSubject;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */
}