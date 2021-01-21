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
//			// return �� �ص� finally�� ������.
//			// �� ������ �ڵ�� ���� �� ��(return �ϱ� ����).
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
