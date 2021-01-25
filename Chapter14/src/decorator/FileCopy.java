package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		long milliSeconds = 0;

		try (FileInputStream fis = new FileInputStream("3DP_Chip_Lite_v1905.exe");
				FileOutputStream fos = new FileOutputStream("copy.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			milliSeconds = System.currentTimeMillis();
			int i;
			// 기본 복사.
			// Time = 19119
			/*
			 * while ((i = fis.read()) != -1) { fos.write(i); }
			 */
			// Buffer을 이용해 복사
			// Time = 72
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			milliSeconds = System.currentTimeMillis() - milliSeconds;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//아래와 같이 데코레이션 패턴을 이용하여 소켓을 문자열로 읽어 한글과 같은 것도 읽을 수 있게 만듦.		
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		isr.readLine();
		
		System.out.println("Time = " + milliSeconds);
	}
}
