package array;

public class BookArrayTest {
public static void main(String[] args) {
	Book[] library = new Book[5];
	Book[] copyLibrary = new Book[5];
	
	for(var i = 0 ; i < library.length;i++) {
		library[i] = new Book("태백산맥".concat(Integer.toString(i+1)) ,"조정래");
	}
	
	//얕은 복사.. --> 주소 복사
	System.arraycopy(library, 0, copyLibrary, 0, 5);
	
	for(var elem : copyLibrary) {
		elem.showBookInfo();		
	}
	
	System.out.println();
	for(int i = 0; i < library.length; i ++) {
		System.out.println(library[i]);
		library[i].showBookInfo();
	}
}
}
