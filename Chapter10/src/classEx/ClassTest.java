package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Person person = new Person("justin");
		System.out.println(person);

		// class 클래스 객체 생성 문자열(경로,이름)이 정확해야함.
		Class c1 = Class.forName("classEx.Person");

		// 단순히 instance생성 (인자값 없음)
		Person person1 = (Person) c1.newInstance();
		System.out.println(person1);

		// 값 삽입하여 생성 인자 갯수 설정.
		Class[] parameteTypes = { String.class, int.class };
		Constructor cons = c1.getConstructor(parameteTypes);

		// 인자 값들 parameteTypes와 인자가 일치해야함.
		Object[] initargs = { "승현", 100 };
		Person personHyun = (Person) cons.newInstance(initargs);
		System.out.println(personHyun);

	}

}
