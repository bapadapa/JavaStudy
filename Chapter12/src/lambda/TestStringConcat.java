package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		//기존 사용법
		StringConImpl impl = new StringConImpl();
		impl.makeString("A", "B");
		
		//람다식 01
		StringConcat concat = (s,v) -> System.out.println(s +" + " +v);
		concat.makeString("C", "D");
		
		
		//람다식 02
		StringConcat concat2 = new StringConcat() {			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				 System.out.println(s1 +" + " +s2);
			}
		};
		 
		concat2.makeString("E", "F");
		
	}
}
