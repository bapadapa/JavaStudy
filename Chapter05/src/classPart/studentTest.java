package classPart;

public class studentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(4567,"�̼���");
		
		//studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
	
		Student studentKim = new Student(1234,"������");
		//studentKim.studentName = "������";
		//studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
	
	
}