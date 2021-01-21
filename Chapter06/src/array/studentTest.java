package array;

public class studentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		Student studentKim = new Student(1002,"Kim");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		System.out.println("====================");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 85);
		studentKim.showStudentInfo();
		
	}
}
