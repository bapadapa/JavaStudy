package thread;
class Bank {
	private int money = 10000;

	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m + save);
	}

	//블럭 방식
	public  void minusMoney(int minus) {
		synchronized (this) {
			int m = this.getMoney();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m - minus);
		}		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

class Park extends Thread {

	public void run() {
		//이곳에서 사용하고 싶다면, 동기화 할 객체를 가져온다
		synchronized (SyncTest.mybank) {
			System.out.println("start save");
			SyncTest.mybank.saveMoney(3000);
			System.out.println("save money = " + SyncTest.mybank.getMoney());
		}

	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.mybank.minusMoney(1000);
		System.out.println("minus money = " + SyncTest.mybank.getMoney());
	}
}

public class SyncTest {
	public static Bank mybank = new Bank();

	public static void main(String[] args) throws InterruptedException {
		Park p = new Park();
		p.start();
		Thread.sleep(200);

		ParkWife pw = new ParkWife();
		pw.start();

	}
}
