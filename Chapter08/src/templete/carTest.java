package templete;

public class carTest {
	public static void main(String[] args) {
		car aiCar = new AICar();
		aiCar.run();

		System.out.println("\n");
		car manualCar = new ManualCar();
		manualCar.run();
	}
}
