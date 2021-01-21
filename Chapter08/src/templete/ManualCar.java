package templete;

public class ManualCar extends car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}
	@Override
	public void stop() {
		System.out.println("사람이 차를 멈춥니다.");
	}

}
