package array;

public class charArrayTest {
	public static void main(String[] args) {
		char[] alpahbets = new char[26];
		char ch = 'A';

		for (int i = 0; i < alpahbets.length; i++) {
			alpahbets[i] = ch++;
		}

		for (char c : alpahbets) {
			System.out.println(c);
		}
	}
}
