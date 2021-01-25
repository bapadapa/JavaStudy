package coffee;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		System.out.println();
		
		Coffee KenyaLatte = new Latte(new KenyaAmericano());
		KenyaLatte.brewing();
		
		System.out.println();
		Coffee KenyaMocha = new Mocha(new KenyaAmericano());
		KenyaMocha.brewing();
		
	}
}
