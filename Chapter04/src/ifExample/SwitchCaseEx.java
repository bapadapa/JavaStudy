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
			System.out.println("금매달");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("은매달");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("동매달");
			break;

		default:
			medalColor = 'A';
			System.out.println("매달이 없습니다.");
			break;
		}
	}
}
