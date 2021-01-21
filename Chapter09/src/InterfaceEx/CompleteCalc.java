package InterfaceEx;

public class CompleteCalc extends Calculator{

	@Override
	public int substact(int num1, int num2) {

		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	/*
	 * @Override public void description() { System.out.println("재정의한 Description");
	 * }
	 */

	
}
