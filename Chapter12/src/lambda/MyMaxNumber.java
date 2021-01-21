package lambda;

//함수형 인터페이스를 알려주는 어노테이션
//1개만 선언할 수 있다.
@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
}
