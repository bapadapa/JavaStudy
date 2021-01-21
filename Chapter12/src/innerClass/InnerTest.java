package innerClass;

//OutClass.class
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	// OutClass$InClass.class
	class InClass {
		int iNum = 100;
		// OutClass ���� ���� ���������� Static ��� �Ұ�.
		// Static int sInNum;

		void inTest() {
			// �ܺ� Ŭ�������� ����� ���̱� ������ ��� ����.
			System.out.println(num);
			System.out.println(sNum);
		}
	}

	public void usingInner() {
		inClass.inTest();
	}

	// Static Inner Class
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}

		static void sTest() {
			// Ŭ������ ������ ���Ŀ� �����Ǿ��� ������ �ܺ� Ŭ������ ��ü ���Ұ�.
			// System.out.println(inNum);

			// �ܺο� �����Ǿ�����, Static �̱� ������ ��밡��
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		outClass.usingInner();

		// �ܺο��� ����Ϸ��� �Ʒ��� ���� ��� ������.
		// ������ �� ��� ����. -> Inner Class�� ���ο����� ��� �ϱ� ���� ����� �����̴�
		OutClass.InClass myInclass = outClass.new InClass();
		myInclass.inTest();
		
		//�Ʒ��� ���� Static Inner Class ��ü�� �����Ͽ� ��� ������.
		OutClass.InStaticClass sInClass  = new OutClass.InStaticClass();
		sInClass.inTest();
		
		//���� ��ü�� �������� �ʾƵ� ��� ������.
		OutClass.InStaticClass.sTest();
	}
}
