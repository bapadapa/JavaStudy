package innerClass;

class Outer2 {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 100;
		// �͸� Ŭ����
		return new Runnable() {
			// ���� ���� Ŭ����
			@Override
			public void run() {
				// ���� ������ ����� ����� ������ �� ����.
				// ����� ����� ������ �Ұ�������, ������ �����ϴ�.

				/*
				 * num += 10; i= 200;
				 */

				// TODO Auto-generated method stub
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}

		};
	}

	// ����� 2
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Test");
		}
	};

}

public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);

		// ���1
		runnable.run();
		// ���2
		outer.runner.run();
	}
}
