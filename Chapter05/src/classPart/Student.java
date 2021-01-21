package classPart;


public class Student {
	
	//멤버 변수,  
	public int studentID;
	public String studentName;
	public String address;	
	
	public Student(int id) {
		studentID = id;
	}	
	
	//오버 로딩. OverLoading
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);		
	}
	public String getStudentName() {
		return studentName;
		
		
	}
	
}


