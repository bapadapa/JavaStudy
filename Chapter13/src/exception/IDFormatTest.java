package exception;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			// throw -> exception �߻� ��Ű�� ��.
			// throws -> exception�� �̷�°�.
			throw new IDFormatException("���̵�� null �� �� �����ϴ�.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵� ���̴� 8 ~ 20�� ����ϼ���");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();

		String myId = null;

		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		myId = "1234567";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
