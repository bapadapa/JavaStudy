package classPart;

public class studentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(4567,"이순신");
		
		//studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
	
		Student studentKim = new Student(1234,"김유신");
		//studentKim.studentName = "김유신";
		//studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
	
	
}