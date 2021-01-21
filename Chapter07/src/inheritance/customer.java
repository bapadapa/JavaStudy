package inheritance;

public class customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		/* System.out.println("customer() ������ ȣ��"); */
	}

	public customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;

		customerGrade = "SILVER";
		bonusRatio = 0.01;
		/* System.out.println("customer(int , String) ������ ȣ��"); */
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCostomerID(int costomerID) {
		this.customerID = costomerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}
