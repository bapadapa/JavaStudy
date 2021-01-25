package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilteInputTest01 {
	public static void main(String[] args) {
		// Auto Close
		try (FileInputStream fis = new FileInputStream("input.txt")) {

			int i;
			while ((i = fis.read()) != -1)
				System.out.print((char) i);

			System.out.println("-------바이트로 읽기---------");
			
			byte[] bs = new byte[10];
			while ((i = fis.read(bs)) != -1)
				for (int k = 0; k < i; k++)
					System.out.print((char) bs[k]);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
