package String;

public class StringBuilderTest {
	public static void main(String[] args) {
		String java = new String("Jave");
		String android = new String("Android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("Android");
		System.out.println(System.identityHashCode(buffer));
		java = buffer.toString();
	}
}
