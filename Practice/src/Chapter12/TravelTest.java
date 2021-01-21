package Chapter12;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCusomter customerLee = new TravelCusomter("�̼���", 40, 100);
		TravelCusomter customerKim = new TravelCusomter("������", 20, 100);
		TravelCusomter customerHong = new TravelCusomter("ȫ�浿", 10, 100);

		List<TravelCusomter> customerList = new ArrayList<TravelCusomter>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		// ù��° ��� -> list ���
		System.out.println(customerList);

		// 2��° ��� -> stream���� ���
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 3��° ��� -> ���� �ջ�
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		// 4��° ��� -> ���Ǻ� ���
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}
}