package templete;

public class AICar extends car {

	@Override
	public void drive() {
		System.out.println("자율주행 시작");
		System.out.println("스스로 방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
		
	}
	

}
