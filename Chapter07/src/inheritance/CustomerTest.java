package inheritance;

public class CustomerTest {
	public static void main(String[] args) {

		customer customerLee = new customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCostomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

//		customer customerKim = new VIPCustomer();
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCostomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}
}
