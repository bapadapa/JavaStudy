package stream.inputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.print("입력 : ");

		try {
			int i;

			//보조 스트림 미사용
//			while ((i = System.in.read()) != '\n') {
//				System.out.print((char) i);
//			}

			// 보조 스트림 사용 (byte로 읽어 드린 것을 문자로 변경해줌 ) 
			InputStreamReader isr = new InputStreamReader(System.in);
			while ((i = isr.read()) != '\n') {
				System.out.print((char) i);
			}
			System.out.println(i);

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
