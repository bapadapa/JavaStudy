package chapter05;

public class OorderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderNum(201907210001L);
		order.setID("abc123");		
		order.setDate("2018�� 3�� 12��");
		order.setName("Ȧ�浿");
		order.setProductCode("PD03245 - 12");
		order.setOrderAddress("����� �������� ���ǵ���");
		
		System.out.println("�ֹ���ȣ : "+ order.getOrderNum());
		System.out.println("�ֹ��� ���̵� : "+ order.getID());
		System.out.println("�ֹ� ��¥ : "+ order.getDate());
		System.out.println("�ֹ��� �̸� : "+ order.getName());
		System.out.println("�ֹ� ��ǰ ��ȣ : "+ order.getProductCode());
		System.out.println("��� �ּ� : "+ order.getOrderAddress());
		
	}
}
 