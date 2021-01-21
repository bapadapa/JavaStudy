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
		// OutClass 생성 이후 생성됨으로 Static 사용 불가.
		// Static int sInNum;

		void inTest() {
			// 외부 클래스에서 사용한 것이기 때문에 사용 가능.
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
			// 클래스가 생성된 이후에 생성되었기 때문에 외부 클래스의 객체 사용불가.
			// System.out.println(inNum);

			// 외부에 생성되었지만, Static 이기 때문에 사용가능
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();

		outClass.usingInner();

		// 외부에서 사용하려면 아래와 같이 사용 가능함.
		// 하지만 잘 사용 안함. -> Inner Class는 내부에서만 사용 하기 위해 만들기 때문이다
		OutClass.InClass myInclass = outClass.new InClass();
		myInclass.inTest();
		
		//아래와 같이 Static Inner Class 객체를 생성하여 사용 가능함.
		OutClass.InStaticClass sInClass  = new OutClass.InStaticClass();
		sInClass.inTest();
		
		//따로 객체를 생성하지 않아도 사용 가능함.
		OutClass.InStaticClass.sTest();
	}
}
