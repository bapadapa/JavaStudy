package exception;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			// throw -> exception 발생 시키는 것.
			// throws -> exception을 미루는것.
			throw new IDFormatException("아이디는 null 일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디 길이는 8 ~ 20로 사용하세요");
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
