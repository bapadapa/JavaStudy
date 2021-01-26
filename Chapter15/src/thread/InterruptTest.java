package thread;

public class InterruptTest extends Thread{
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
		try {
			sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Wake");
		}		
	}
	public static void main(String[] args) {
		InterruptTest test = new InterruptTest();
		System.out.println("strat");
		test.start();
		test.interrupt();
		System.out.println("end");
	}
}
