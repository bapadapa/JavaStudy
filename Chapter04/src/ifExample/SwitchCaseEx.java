package ifExample;

import java.util.Scanner;

public class SwitchCaseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rank = sc.nextInt();
		char medalColor;

		switch (rank) {
		case 1:
			medalColor = 'G';
			System.out.println("�ݸŴ�");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("���Ŵ�");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("���Ŵ�");
			break;

		default:
			medalColor = 'A';
			System.out.println("�Ŵ��� �����ϴ�.");
			break;
		}
	}
}
