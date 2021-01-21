package chapter09;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("Sorting Method : ");
		System.out.println("B : Bubble");
		System.out.println("H : Heap");
		System.out.println("Q : Quick");

		int ch = System.in.read();
		Sort sort = null;
		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("Wrong!!");
		}
		int[] arr = { 1, 2, 3, 4, 5 };
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

	}
}
