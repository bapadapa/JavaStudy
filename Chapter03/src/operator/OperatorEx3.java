package operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		//  || �� �տ��� true �� �ڿ� ���� ����
		//  && �� �տ��� false �� �ڿ� ���� ���� 
		 
		boolean value = (( num1 = num1+10) <10) && (( i=i+2) <10);
		
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		int num2 = 10;
		int num3 = 20;
		
		
		int max = (10 > 20 )?  num2 : num3 ;
		System.out.println(max);
		
	}
}
