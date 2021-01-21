package String;

public class StringTest2 {
	public static void main(String[] args) {

		String java = new String("Jave");
		String android = new String("Ansdroid");
		System.out.println(System.identityHashCode(java)); //기존 메모리 

		java = java.concat(android);
		//java += android;
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); //새로운 메모리 
	}
}
