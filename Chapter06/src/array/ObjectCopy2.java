package array;

public class ObjectCopy2 {
public static void main(String[] args) {
	Book[] library = new Book[5];
	Book[] copyLibrary = new Book[5];
	Book[] DeepCopyLibrary = new Book[5];
	
	for(var i = 0 ; i < library.length;i++) {
		library[i] = new Book("태백산맥".concat(Integer.toString(i+1)) ,"조정래");
	}
	
	//얕은 복사.. --> 주소 복사
	System.arraycopy(library, 0, copyLibrary, 0, 5);
	
	for(var elem : copyLibrary) {
		elem.showBookInfo();		
	}
	
	//깊은 복사.. --> 그냥 흔히 생각하는 복사 . 
	for(var i = 0 ; i < library.length;i++) {
		DeepCopyLibrary[i] = new Book(library[i].getTitle(),library[i].getAuthor());
	}
	
	System.out.println("깊은 복사");
	for(var elem : DeepCopyLibrary) {
		elem.showBookInfo();
	}
	
	
	System.out.println();
	for(int i = 0; i < library.length; i ++) {
		System.out.println(library[i]);
		library[i].showBookInfo();
	}
}
}
