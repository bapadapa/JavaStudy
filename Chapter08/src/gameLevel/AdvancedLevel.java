package gameLevel;

public class AdvancedLevel extends playerLevel{
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump �մϴ�.");
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
