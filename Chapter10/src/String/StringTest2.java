package String;

public class StringTest2 {
	public static void main(String[] args) {

		String java = new String("Jave");
		String android = new String("Ansdroid");
		System.out.println(System.identityHashCode(java)); //���� �޸� 

		java = java.concat(android);
		//java += android;
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); //���ο� �޸� 
	}
}
