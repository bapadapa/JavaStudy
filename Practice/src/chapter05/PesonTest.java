
package chapter05;

public class PesonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChild = 3;
		
		System.out.println(person.age);		
		System.out.println(person.name);		
		System.out.println(person.isMarried);		
		System.out.println(person.numberOfChild);		
	}
}
