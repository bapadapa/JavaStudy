package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("a.txt")){			
		}catch (FileNotFoundException e) {
				System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
		
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//			// return 을 해도 finally는 실행함.
//			// 그 이후의 코드는 실행 안 함(return 하기 때문).
//			return;
//		} finally {
//			try {
//				fis.close();
//				System.out.println("Finally Block!");
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}

	}
}
