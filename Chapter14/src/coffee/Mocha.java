package coffee;

public class Mocha extends Latte{
	public Mocha(Coffee coffee) {
		super(coffee);
	}
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("Adding Choco");
	}	

}
