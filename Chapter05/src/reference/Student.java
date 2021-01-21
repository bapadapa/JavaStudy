package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID =id;
		studentName = name;
		
		korea = new Subject();		
		math = new Subject();		
	}
	
	public void setKoreaSubject(String name , int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name , int score) {
		math.subjectName = name;
		math.score = score;
	}

	public void StudentScore() {		
		System.out.println(studentName + "학생의 총점은 "+ (korea.score + math.score) + "점 입니다.");
	}
	
	/*
	 * int koreaScore; int mathScore; int engScore;
	 * 
	 * String koreaName; String mathName; String esngName;
	 */
}
