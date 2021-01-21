package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("justin");
		System.out.println(person);

		// class Ŭ���� ��ü ���� ���ڿ�(���,�̸�)�� ��Ȯ�ؾ���.
		Class c1 = Class.forName("classEx.Person");

		// �ܼ��� instance���� (���ڰ� ����)
		Person person1 = (Person) c1.newInstance();
		System.out.println(person1);

		// �� �����Ͽ� ���� ���� ���� ����.
		Class[] parameteTypes = { String.class, int.class };
		Constructor cons = c1.getConstructor(parameteTypes);

		// ���� ���� parameteTypes�� ���ڰ� ��ġ�ؾ���.
		Object[] initargs = { "����", 100 };
		Person personHyun = (Person) cons.newInstance(initargs);
		System.out.println(personHyun);

	}

}
