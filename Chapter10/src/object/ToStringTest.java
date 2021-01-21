package object;

class Book implements Cloneable{

	String title;
	String author;

	public Book(String title, String authoer) {
		this.title = title;
		this.author=authoer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	//	return super.toString();
		return author + " , " + title;
	}
	//N�� ���� ���� : Native Code��� ��!
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//��ü�� heap ���� ������ �� �������÷��Ͱ� ȣ��. (���ҽ� ���� , ��ġ�� ���� ���� �ݱ�) 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

public class ToStringTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("����","�ڰ渮");
		System.out.println(book);
		
		String str = new String("����");
		//toString -> ObjectŬ����.
		System.out.println(str.toString());
		
		Book book2 =  (Book)book.clone();
		
		System.out.println(book2);
		
	}
}
