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

		// �ּҰ� ��
		System.out.println(str1 == str2);
		// ��ü �� ��
		System.out.println(str1.equals(str2));
		
		student Lee = new student(100, "�̼���");
		student Lee2 = Lee;
		student Shin = new student(100, "�̼���");
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(Shin));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println();
		System.out.println(i1.equals(i2));
		//�ؽ��� --> ������ �����ؼ� ������ �� ��ȯ
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		//���� HashCode Ȯ��  --> �콬��(�޸� �ּҰ� ) 
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	

	}
}
