package com.itwill05.service.account;

import java.util.ArrayList;

/*
 * 1.ArrayList<Student>(학생객체들) 을멤버변수로가진다.
 * 2.Student객체전체에관련된 업무를 실행할클래스
 */
public class StudentServiceArrayList {

	private ArrayList<Student> studentList;

	public StudentServiceArrayList() {
		studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "KIM", 89, 93, 94));
		studentList.add(new Student(2, "HIM", 88, 77, 98));
		studentList.add(new Student(3, "AIM", 65, 87, 99));
		studentList.add(new Student(4, "KIM", 75, 97, 60));
		studentList.add(new Student(5, "XIM", 85, 98, 90));
		studentList.add(new Student(6, "TIM", 95, 88, 77));
		studentList.add(new Student(7, "KIM", 99, 93, 95));
		studentList.add(new Student(8, "LIM", 83, 80, 99));
		studentList.add(new Student(9, "QIM", 73, 90, 80));
	}

	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		studentList.add(student);
	}

	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		for (int i = 0; i < studentList.size(); i++) {
			Student tempStudent = studentList.get(i);
			tempStudent.calculateTotal();
			tempStudent.calculateAvg();
			tempStudent.calculateGrade();
		}
		/*
		for (Student student : studentList) {
			student.calculateTotal();
			student.calculateAvg();
			student.calculateGrade();
		}
		*/

	}

	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public void calculateRank() {
		int count = 1;
		for (int i = 0; i < studentList.size(); i++) {
			count = 1;
			for (int j = 0; j < studentList.size(); j++) {
				if (studentList.get(i).getTot() < studentList.get(j).getTot()) {
					count++;
				}
			}
			studentList.get(i).setRank(count);
		}
	}

	/*
	 * 3. 전체학생반환
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	/*
	 * 4. 번호3번 학생한명 반환  
	 */
	public Student findByStudent(int no) {
		Student findStudent = null;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getNo() == no) {
				findStudent = studentList.get(i);
			}
		}
		return findStudent;
	}

	/*
	 * 5. 학점A인 학생들 반환
	 */
	public ArrayList<Student> findByGrade(char grade) {
		ArrayList<Student> findStudents = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getGrade() == grade) {
				findStudents.add(studentList.get(i));
			}
		}
		return findStudents;
	}

	/*
	 * 6. 이름KIM 학생들 반환
	 */
	public ArrayList<Student> findByName(String name) {
		ArrayList<Student> findStudents = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().equals(name)) {
				findStudents.add(studentList.get(i));
			}
		}
		return findStudents;
	}

	/*
	 * 7. 학생총점으로 오름차순정렬(X)
	 */
	public void sortByTotAsc() {
		Student temp = null;
		for (int i = 0; i < studentList.size() - 1; i++) {
			for (int j = 0; j < studentList.size() - 1 - i; j++) {
				if (studentList.get(j).getTot() > studentList.get(j + 1).getTot()) {
					temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);
				}
			}
		}
	}

	/*
	 8. 학생이름순으로 오름차순정렬(X)
	 */
	public void sortByNameAsc() {
		Student temp = null;
		for (int i = 0; i < studentList.size() - 1; i++) {
			for (int j = 0; j < studentList.size() - 1 - i; j++) {
				if (studentList.get(j).getName().charAt(0) > studentList.get(j + 1).getName().charAt(0)) {
					temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);
				} else if (studentList.get(j).getName().charAt(0) == studentList.get(j + 1).getName().charAt(0)
						&& studentList.get(j).getName().charAt(1) > studentList.get(j + 1).getName().charAt(1)) {
					temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);
				}
			}
		}
	}

}
