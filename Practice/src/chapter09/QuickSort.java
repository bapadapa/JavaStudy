package chapter09;

public class QuickSort implements Sort{
	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort descending");
		}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("Quick Sort");
	}

}
