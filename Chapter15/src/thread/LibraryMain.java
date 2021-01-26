package thread;

import java.util.ArrayList;

class FastLibrary {
	public ArrayList<String> books = new ArrayList<String>();

	public FastLibrary() {
		for (int i = 1; i <= 3; i++) {
			books.add("�¹��� " + i);
		}
	}

	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();

		//if�� �ص� �ǳ�, returnBook���� notifyAll()�� �̿��ؼ� ��� ���� ��������,
		//while�� �̿��Ͽ� �����ϴ� ���� ����.
		while(books.size() == 0 ) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}

	public void returnBook(String title) {
		synchronized(this) {
			Thread t = Thread.currentThread();
			books.add(title);
			notifyAll();
			System.out.println(t.getName() + " : " + title + " return");	
		}
		
	}
}

class Student extends Thread {
	public void run() {
		try {
			String title = LibraryMain.library.lendBook();
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {
	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
		Student stu6 = new Student();
		
		stu1.start();
		stu2.start();
		stu3.start();
		stu4.start();
		stu5.start();
		stu6.start();
	}
}
