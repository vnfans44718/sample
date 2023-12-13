
public class GymT {

	/*
	 * 
	 * 5.[OPTION]다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요[]
	
	1. 헬스장 강사
	키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당 입니다.
	키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다.
	
	// 기본 데이터 
	키, 몸무게, 성별, 이름, 나이, 담당 
	 */

	// 필드 선언
	String name;
	int age;
	String gender;
	int height;
	int weight;
	String task;

	// 메소드 선언
	// 기본데이터 대입 메소드

	public void setData(int height, int weight, String gender, String name, int age, String task) {

		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.task = task;
	}

	// 학생정보 출력 메소드
	public void print() {
		System.out.println("키가 " + this.height + " 이고 몸무게가 " + this.weight + " 킬로인 " + this.gender + ", 이름은 "
				+ this.name + " 이고 나이는 " + this.age + "이며 " + this.task + "담당 입니다.");

	}

	/*
		1. 헬스장 강사
		키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당 입니다.
		키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다.
	
	*/

}
