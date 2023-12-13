

public class Health {
	int tall;
	int weigh;
	String sex;
	String name;
	int age;
	String job;

	public void data(int tall, int weigh, String sex, String name, int age, String job) {
		this.tall=tall;
		this.weigh=weigh;
		this.sex=sex;
		this.name=name;
		this.age=age;
		this.job=job;
		
	}
	public void print() {
		System.out.printf("키가 %d이고 몸무게가 %d 킬로인 %s, 이름은 %s이고 나이는 %d이며 %s 담당 입니다.\n",this.tall,this.weigh,this.sex,this.name,this.age,this.job);
	}
}
/*헬스장 강사

키가 180 이고 몸무게가 78 킬로인 남성, 이름은 Tomas 이고 나이는 37세이며 PT담당 입니다.
키가 170 이고 몸무게가 50 킬로인 여성, 이름은 Alice 이고 나이는 26세이며 요가담당 입니다.
*/