package polymorphism;

public class GoldCustomer extends customer{
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		// TODO Auto-generated constructor stub
		super(customerID,customerName);
		customerGrade = "GOLD";
		bonusRatio= 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;  
		return price - (int)(price * salesRatio);
	}
	

}
