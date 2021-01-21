package InterfaceEx;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell");

	}

	@Override
	public void Buy() {
		System.out.println("Customer Buy");

	}

	@Override
	public void order() {		
		//InterfaceEx.Buy.super.order();
		System.out.println("Customer order");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	

}
