package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		// ����.
		PrintString lambdaStr = s -> System.out.println(s);
		// �ܼ����
		lambdaStr.showString("Test");

		// �Լ��̿���
		showMyString(lambdaStr);

		// ���� �� �Լ� ���
		PrintString test2 = returnString();
		test2.showString("Test3");

		// ���� �� �͸��Լ� ���
		PrintString test3 = new PrintString() {
			@Override
			public void showString(String str) {
				System.out.println(str + "~~~");
			}
		};
		test3.showString("test03");
	}
	//�Լ� ����
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	//�Լ� + �ʱ�ȭ
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
