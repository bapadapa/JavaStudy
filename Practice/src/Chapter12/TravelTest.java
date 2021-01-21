package Chapter12;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCusomter customerLee = new TravelCusomter("이순신", 40, 100);
		TravelCusomter customerKim = new TravelCusomter("김유신", 20, 100);
		TravelCusomter customerHong = new TravelCusomter("홍길동", 10, 100);

		List<TravelCusomter> customerList = new ArrayList<TravelCusomter>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		// 첫번째 출력 -> list 출력
		System.out.println(customerList);

		// 2번째 출력 -> stream으로 출력
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 3번째 출력 -> 가격 합산
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		// 4번째 출력 -> 조건부 출력
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}
}