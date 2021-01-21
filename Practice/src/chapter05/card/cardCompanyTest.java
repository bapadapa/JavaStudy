package chapter05.card;

public class cardCompanyTest {
public static void main(String[] args) {
	
	cardCompany company = cardCompany.getInstance();
	
	card myCard = company.createCard();
	card yourCard= company.createCard();
	
	System.out.println(myCard.getCardNum());
	System.out.println(yourCard.getCardNum());
}
}
