package InterfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.Buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy  buyer = customer;
		buyer.Buy();
		buyer.order();
		
		Sell sell = customer;
		sell.sell();
		sell.order();
	}
}
