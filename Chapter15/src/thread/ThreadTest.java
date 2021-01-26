package thread;

class myThread extends Thread {
	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.println(i + "\t");

			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable {
	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.println(i + "\t");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("start");
		
		//规过 01
		//extends Thread
		/*
		 * myThread th1 = new myThread(); myThread th2 = new myThread(); th1.start();
		 * th2.start();
		 */

		//规过 02
		// implements Runnable
		/*
		 * MyThread2 runner1 = new MyThread2(); Thread th3 = new Thread(runner1);
		 * th3.start();
		 * 
		 * MyThread2 runner2 = new MyThread2(); Thread th4 = new Thread(runner2);
		 * th4.start();
		 */
		Thread t= Thread.currentThread();
		System.out.println(t);

		System.out.println("end");
	}
}
