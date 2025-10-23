package javafesivalQ;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해 주세요 >> ");
		String num = sc.next();

		// 입력된 문자열을 split()로 한 문자 씩 나눠주기 위해.

		String[] arr = num.split(""); // 한 문자 단위로 끊겠다.

		// 대시문자의 갯수를 누적할 수 있는 변수 생성
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "0":
				cnt += 6;
				break;
			case "1":
				cnt += 2;
				break;
			case "2":
				cnt += 5;
				break;
			case "3":
				cnt += 5;
				break;
			case "4":
				cnt += 4;
				break;
			case "5":
				cnt += 5;
				break;
			case "6":
				cnt += 6;
				break;
			case "7":
				cnt += 3;
				break;
			case "8":
				cnt += 7;
				break;
			case "9":
				cnt += 6;
				break;
			}
		}
		System.out.print("대시('-')의 총 합 >> " + cnt);

	}

}
