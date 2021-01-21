package staticEx;


public class Student {
	
	
	private static int serialNum = 1000;
	//��� ����,  
	public int studentID;	
	public String studentName;
	public String address;	
	
	public Student(int id) {
		studentID = id;
		serialNum++;
	}	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum++;
	}	
	
	//���� �ε�. OverLoading
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);		
	}
	public String getStudentName() {
		return studentName;
		
		
	}
	
}
