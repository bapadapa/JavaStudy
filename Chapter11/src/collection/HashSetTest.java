package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		//�ߺ� �Ұ�, ���� ����.
		HashSet<String> set = new HashSet<>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
