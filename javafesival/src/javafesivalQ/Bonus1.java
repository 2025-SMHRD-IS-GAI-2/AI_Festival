package javafesivalQ;

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();

			System.out.print("B 입력 >> ");
			int b = sc.nextInt();

			int c = 0;
			for (int i = 0; i < 100; i++)
				c = a - b;

			if (a == 0 && b == 0) {
				a = b = 0;
				break;
			}
			System.out.println("결과 >> " + c);
		}

	}

}
