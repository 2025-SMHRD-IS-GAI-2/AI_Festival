package javafesivalQ;

public class Q28 {

	public static void main(String[] args) {

		String str = "01001101";

		String[] str1 = str.split("");

		int[] arr = new int[str1.length];
		// 문자형 배열을 정수형 배열에 다시 저장하기
		for (int i = 0; i < str1.length; i++) {
			arr[i] = Integer.parseInt(str1[i]);
		}

		// 승 수별 연산을 통한 10진수 값 만들기
		int cnt = 1;

		int sum = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i] * cnt;
			cnt *= 2;
		}

		System.out.println(str + "(2) = " + sum + "(10)");

	}

}
