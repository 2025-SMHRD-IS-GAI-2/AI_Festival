package javafesivalQ;

public class Bonus2 {

	public static void main(String[] args) {
		// 입력 : power , test
		// 출력 : w , es
		// 입력된 문자의 개수가 홀수인지, 짝수인지 판별 중요!!
		// - 짝수 : 가운데 2개 글자
		// - 홀수 : 가운데 1개 글자
		String word = "power";
		String[] arr = word.split("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}

	private static String getMiddle(String input) {
		String[] arr = input.split("");
		int num = arr.length;
		String result = null;
		if (num % 2 == 0) {
			// 글자수가 짝수인 경우 T E S T
			// 0 1 2 3
			// 4/2 => 몫 : 2
			result = arr[num / 2 - 1] + arr[num / 2];
			// return result;
		} else {
			// 글자수가 홀수인 경우 -> P O W E R
			// 0 1 2 3 4
			result = arr[num / 2];
			// return result;
		}
		return result;
	}

}
