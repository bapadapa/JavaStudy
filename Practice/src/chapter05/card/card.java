package chapter05.card;

public class card {
	private static int serialNum = 10000;
	int cardNum;

	public card() {		
		cardNum = ++serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
}
