package reference;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);

		studentLee.StudentScore();
	}
}
