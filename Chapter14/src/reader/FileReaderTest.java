package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {

		// 방법01 -> FileReader로 읽으면 안깨짐.
		// 문자 베이스로 읽을떈 reader를 사용을 많이 하고, 편함.
		// FileReader fis = new FileReader("reader.txt");

		// FileInputStream으로 읽으면 한글이 꺠짐. < Byte 단위로 읽기 >
		// 방법02 -> FileInputStream + InputStreamReader ( 보조 스트림 ) 조합으로 읽는다.
		// < 데코레이터 패턴 >
		// < 소켓과 같은곳에서 사용 많이함 >
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		int i;
		while ((i = isr.read()) != -1) {
			System.out.print((char) i);
		}
		// fis.close();
		// 보조스트림을 닫으면 기존 스트림까지 닫아짐.
		isr.close();
	}
}
