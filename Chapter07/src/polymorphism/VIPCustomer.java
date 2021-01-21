package polymorphism;

public class VIPCustomer extends customer{

	double salesRatio;
	private int agnetID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		/* System.out.println("VIP() ������ ȣ��"); */
	}
	
	//������̼� (Anotation)
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		/* System.out.println("VIP(int , String) ������ ȣ��"); */
	}
}