package javafesivalQ;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int sum = 0;
		int num1 = num;

		String process = "";

		while (num1 > 0) {
			int num2 = num1 % 10;
			sum += num2;
			process = num2 + process;
			num1 /= 10;
			if (num1 > 0) {
				process = "+" + process;
			}
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
