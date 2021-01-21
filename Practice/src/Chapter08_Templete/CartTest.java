package Chapter08_Templete;

import java.util.ArrayList;

public class CartTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for(Car car : carList) {
			car.Run();
			System.out.println("===============");
		}
	}
}
