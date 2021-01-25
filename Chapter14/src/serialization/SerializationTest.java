package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	//transient -> 직렬화 안한다는 의미
	transient String job;

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {

		return name + " + " + job;
	}

}
class Person2 implements Externalizable {

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub		
	}

}

public class SerializationTest {
	public static void main(String[] args) {
		Person personLee = new Person("이순신", "도선사");
		Person personKim = new Person("김유신", "장군");

		//Write
		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personLee);
			oos.writeObject(personKim);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try (FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1= (Person)ois.readObject();
			Person p2= (Person)ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
