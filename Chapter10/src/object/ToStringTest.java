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
	//N이 들어가는 이유 : Native Code라는 뜻!
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//객체가 heap 에서 해제될 때 가비지컬렉터가 호출. (리소스 해제 , 닫치지 않은 소켓 닫기) 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

public class ToStringTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지","박경리");
		System.out.println(book);
		
		String str = new String("토지");
		//toString -> Object클래스.
		System.out.println(str.toString());
		
		Book book2 =  (Book)book.clone();
		
		System.out.println(book2);
		
	}
}
