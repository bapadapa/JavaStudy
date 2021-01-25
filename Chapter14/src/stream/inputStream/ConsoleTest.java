package stream.inputStream;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		
		//콘솔에서 사용 가능. 이클립스에서는 안됨.
		//패키지에 들어있는 프로그램은 패키지 풀네임으로 해야함.
		Console console = System.console();
		
		System.out.println("Name : ");
		String name = console.readLine();
		System.out.println("Password : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}
}
