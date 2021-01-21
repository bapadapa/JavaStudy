package chapter05.card;

public class cardCompany {
	private static cardCompany instance = new cardCompany();

	public static cardCompany getInstance() {
		if(instance == null) {
			instance = new cardCompany();
		}
		return instance;
	}

	public card createCard() {
		card card = new card();
		return card;
	}
}
