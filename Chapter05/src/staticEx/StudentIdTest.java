package staticEx;

public class StudentIdTest {
	public static void main(String[] args) {
		Student studentLee = new Student(Student.getSerialNum(),"Lee");
		System.out.println(studentLee.studentID);
		Student studentKim = new Student(Student.getSerialNum(),"Kim");
		System.out.println(studentLee.studentID);
		System.out.println(studentKim.studentID);
	}
}
