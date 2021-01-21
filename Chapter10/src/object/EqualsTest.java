package object;


class student{
	int studentNum;
	String studentName;
	
	public student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof student) {
			student stu = (student)obj;
			if(this.studentNum == stu.studentNum) {
				return true;			
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		// 주소값 비교
		System.out.println(str1 == str2);
		// 객체 값 비교
		System.out.println(str1.equals(str2));
		
		student Lee = new student(100, "이순신");
		student Lee2 = Lee;
		student Shin = new student(100, "이순신");
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(Shin));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println();
		System.out.println(i1.equals(i2));
		//해쉬값 --> 위에서 변경해서 동일한 값 반환
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		//실제 HashCode 확인  --> 헤쉬값(메모리 주소값 ) 
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	

	}
}
