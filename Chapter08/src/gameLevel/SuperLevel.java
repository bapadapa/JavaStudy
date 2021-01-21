package gameLevel;

public class SuperLevel extends playerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 Jump 하지롱~");
	}

	@Override
	public void turn() {
		System.out.println("turn 하지롱~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다.******");
	}
}
