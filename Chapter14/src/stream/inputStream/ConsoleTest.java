package stream.inputStream;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		
		//�ֿܼ��� ��� ����. ��Ŭ���������� �ȵ�.
		//��Ű���� ����ִ� ���α׷��� ��Ű�� Ǯ�������� �ؾ���.
		Console console = System.console();
		
		System.out.println("Name : ");
		String name = console.readLine();
		System.out.println("Password : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}
}
