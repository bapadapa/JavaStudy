package gameLevel;

public class BeginnerLevel extends playerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump ��������~");
	}

	@Override
	public void turn() {
		System.out.println("turn ��������~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** �ʱ��� �����Դϴ�.******");
	}

}
