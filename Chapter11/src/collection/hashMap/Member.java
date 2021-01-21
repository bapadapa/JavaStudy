package collection.hashMap;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memberId, String memberName) {
		// TODO Auto-generated constructor stub
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}

	// �Ʒ��� ���� �������Ͽ� �ߺ����� �Ұ��ϰ� ����
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (this.memberId == member.memberId);
		}
		return super.equals(obj);
	}
	/*
	 * @Override public int compareTo(Member member) { // TODO Auto-generated method
	 * stub
	 * 
	 * //�������� return -(this.memberId - member.memberId); //�̸����� ���� //return
	 * this.memberName.compareTo(member.getMemberName()); }
	 */

	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
	}

}
