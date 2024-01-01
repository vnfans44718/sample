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
		for (int i=0; i<members.length; i++) {
			members[i].print();
		}	
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findByNo(int no) {
	AcademyMember findByNo = null;
	for (int i = 0; i < members.length; i++) {
		if (members[i].getNo() == no) {
			findByNo = members[i];
		}
	}
	return findByNo;
	
	
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				count++;
			}
		}
		AcademyMember[] findByName = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
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
	public AcademyMember[] findByStu() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				count++;
			}
		}
		AcademyMember[] findByStu = new AcademyMember[count];
		for (int i = 0, j=0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				findByStu[j] = members[i];
				j++;
			}
		}
		return findByStu;
	}
	
	public AcademyMember[] findByStaff() {
		int count=0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				count++;
			}
		}
		AcademyMember[] findByStaff = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				findByStaff[j] = members[i];
				j++;
			}
		}
		return findByStaff;
	}
	
	public AcademyMember[] findByGangsa() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				count++;
			}
		}
		AcademyMember[] findByGangsa = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				findByGangsa[j] = members[i];
				j++;
			}
		}
		return findByGangsa;
	}
	
	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findByBan(String ban) {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if ((academyMember instanceof AcademyStudent) && ((AcademyStudent)academyMember).getBan().equals(ban) ) {
				count++;
			}
		}
		AcademyMember[] findByBan = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
			if ((members[i] instanceof AcademyStudent) && ((AcademyStudent)members[i]).getBan().equals(ban)) {
				findByBan[j] = members[i];
				j++;
			}
		}
		return findByBan;
	}

	public AcademyMember[] findByDepart(String depart) {
		int count  = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff && ((AcademyStaff)academyMember).getDepart().equals(depart)) {
				count++;
			}
		}
		AcademyMember[] findByDepart = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff && ((AcademyStaff)members[i]).getDepart().equals(depart)) {
				findByDepart[j] = members[i];
				j++;
			}
		}
		return findByDepart;
	}

	public AcademyMember[] findBySubject(String subject) {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa && ((AcademyGangsa)academyMember).getSubject().equals(subject)) {
				count++;
			}
		}
		AcademyMember[] findBySubject = new AcademyMember[count];
		for (int i = 0,j=0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa && ((AcademyGangsa)members[i]).getSubject().equals(subject)) {
				findBySubject[j]= members[i];
				j++;
			}
		}
		return findBySubject;
	}
}
	
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

	