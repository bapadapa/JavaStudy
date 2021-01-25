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
			// �⺻ ����.
			// Time = 19119
			/*
			 * while ((i = fis.read()) != -1) { fos.write(i); }
			 */
			// Buffer�� �̿��� ����
			// Time = 72
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			milliSeconds = System.currentTimeMillis() - milliSeconds;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�Ʒ��� ���� ���ڷ��̼� ������ �̿��Ͽ� ������ ���ڿ��� �о� �ѱ۰� ���� �͵� ���� �� �ְ� ����.		
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		isr.readLine();
		
		System.out.println("Time = " + milliSeconds);
	}
}
