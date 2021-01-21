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

		// 단순 출력
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		// Map연산
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// sort연산
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		// sort + map + 출력
		sList.stream().sorted().map(s -> s.length()).forEach(n -> System.out.print(n + " "));

	}
}
