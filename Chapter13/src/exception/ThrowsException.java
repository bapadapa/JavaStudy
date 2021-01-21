package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("b.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// 위 2개의 Exception이 아닌 다른 Exception
			System.out.println(e);
		}
		System.out.println("end");
	}
}
