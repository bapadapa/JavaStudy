package chapter05;

public class OorderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderNum(201907210001L);
		order.setID("abc123");		
		order.setDate("2018년 3월 12일");
		order.setName("홀길동");
		order.setProductCode("PD03245 - 12");
		order.setOrderAddress("서울시 영등포구 여의도동");
		
		System.out.println("주문번호 : "+ order.getOrderNum());
		System.out.println("주문자 아이디 : "+ order.getID());
		System.out.println("주문 날짜 : "+ order.getDate());
		System.out.println("주문자 이름 : "+ order.getName());
		System.out.println("주문 상품 번호 : "+ order.getProductCode());
		System.out.println("배송 주소 : "+ order.getOrderAddress());
		
	}
}
 