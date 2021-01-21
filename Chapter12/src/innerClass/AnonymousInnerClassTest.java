package innerClass;

class Outer2 {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {

		int num = 100;
		// 익명 클래스
		return new Runnable() {
			// 지역 내부 클래스
			@Override
			public void run() {
				// 내부 변수를 상수로 만들어 변경할 수 없다.
				// 상수로 만들어 변경은 불가하지만, 참조는 가능하다.

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

	// 사용방법 2
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

		// 사용1
		runnable.run();
		// 사용2
		outer.runner.run();
	}
}
