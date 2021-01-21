package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		// 선언.
		PrintString lambdaStr = s -> System.out.println(s);
		// 단순사용
		lambdaStr.showString("Test");

		// 함수이용사용
		showMyString(lambdaStr);

		// 선언 및 함수 사용
		PrintString test2 = returnString();
		test2.showString("Test3");

		// 선언 및 익명함수 사용
		PrintString test3 = new PrintString() {
			@Override
			public void showString(String str) {
				System.out.println(str + "~~~");
			}
		};
		test3.showString("test03");
	}
	//함수 선언
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	//함수 + 초기화
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
