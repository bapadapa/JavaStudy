package InterfaceEx;

public interface Buy {
	void Buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
