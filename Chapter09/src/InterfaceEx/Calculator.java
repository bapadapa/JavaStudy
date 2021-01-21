package InterfaceEx;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0)
			return ERROR;
		return num1 / num2;
	}

}
