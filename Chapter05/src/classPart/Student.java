package classPart;


public class Student {
	
	//��� ����,  
	public int studentID;
	public String studentName;
	public String address;	
	
	public Student(int id) {
		studentID = id;
	}	
	
	//���� �ε�. OverLoading
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);		
	}
	public String getStudentName() {
		return studentName;
		
		
	}
	
}

