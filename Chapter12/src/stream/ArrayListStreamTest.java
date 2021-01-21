package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("Tom");
		sList.add("Susan");
		sList.add("Justin");
		sList.add("Jim");

		Stream<String> stream = sList.stream();

		// �ܼ� ���
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		// Map����
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// sort����
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		// sort + map + ���
		sList.stream().sorted().map(s -> s.length()).forEach(n -> System.out.print(n + " "));

	}
}
