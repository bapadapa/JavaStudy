package InterfaceEx;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add (int num1 , int num2);
	int substact (int num1 , int num2);
	int times (int num1 , int num2);
	int divide (int num1 , int num2);
	
	default void description() {
		System.out.println("정수 계산기");
		myMethod();
	}
	
	static int total(int [] arr) {
		int total= 0;
		
		for(int i : arr) {
			total +=i;
		}
		
		mystaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("this is private Static method");
	}
}
