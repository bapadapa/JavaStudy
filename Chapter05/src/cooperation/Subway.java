package cooperation;

public class Subway {
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {

		this.lineNum  =lineNum;
	}
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void ShowInfo() {
		System.out.println(lineNum + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
	}
	
}
