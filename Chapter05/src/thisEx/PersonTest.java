package thisEx;

public class PersonTest {

	public static void main(String[] args) {
		Person personNoname = new Person();
		personNoname.showInfo();

		Person personLee = new Person("Lee", 20);
		personLee.showInfo();

		Person p = personLee.getSelf();
		p.showInfo();
	}

}
