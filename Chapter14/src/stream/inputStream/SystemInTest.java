package stream.inputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.print("�Է� : ");

		try {
			int i;

			//���� ��Ʈ�� �̻��
//			while ((i = System.in.read()) != '\n') {
//				System.out.print((char) i);
//			}

			// ���� ��Ʈ�� ��� (byte�� �о� �帰 ���� ���ڷ� �������� ) 
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
