package cooperation;

public class Student {

	String stuName;
	int grade;
	int money;
	
	public Student(String stuName, int money) {
		this.stuName = stuName;
		this.money = money;
		
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway Subway) {
		Subway.take(1000);
		this.money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(stuName + "님의 남은 돈은 " +money+"원 입니다." );
	}
	
}
