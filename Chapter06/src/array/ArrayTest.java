package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int total  = 0;
		
		for(int i = 0 , num = 1; i < arr.length ; i ++ ,num++) {
			arr[i] = num;
		}
		
		for (int i : arr) {
			total +=i;			
		}
		
		System.out.println(total);
		
		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[3] = 3.1;
		
		double mtotal = 1;
		for (double d : dArr) {
			if(d!=0)
				mtotal *= d;			
		}		
		System.out.println(mtotal);
	}
}
