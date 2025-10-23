package javafesivalQ;

public class Q9 {

	public static void main(String[] args) {
		// 아스키 코드(ASCII) 코드 현호현호 
		// American Standard Code for Information Interchange
		// : 문자와 기호를 컴퓨터에서 사용할 수 있도록 숫자와 매핑한 것!
		// -> 각 문자는 고유한 아스키 코드 값을 가진다!
		//  ex) A : 65, B : 66 
		
		// 16진수 : Hexadecimal 
		// 0~9까지는 10진수로 표기, 10->A, 11->B,.... 15->F
		// 423(10) -> 10진수인것을 표시해주는것.
		// 423 -> 16진수로 표기!
		// 423을 16으로 나눕니다! 나누어 떨어질 때 까지!!
		
		// char : 기본 자료형 , 문자 1개만 저장!!
		// char로 저장할 때, 내부적으로 정수를 저장합니다!
		//    -> 각 문자에 대한 아스키 고유 값을 저장!!
		// char c = 'A' ; -> 내부적으로 65를 저장!!
		
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + " ");
		}
		
		
	}

}


// 	우리 팀장 멋있어 
// 다 같이 파이팅!!!