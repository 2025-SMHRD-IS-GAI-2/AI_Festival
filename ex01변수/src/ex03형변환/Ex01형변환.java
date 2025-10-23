package ex03형변환;

public class Ex01형변환 {

	public static void main(String[] args) {

		// 형 변환 : Type Casting
		// int : 4byte, double : 8byte
		int a =3;
		// 1. a를 출력해 보세요!
		System.out.println(a);
		// 2. double 자료형을 담을 수 있는 변수 b를 선언해보세요!
		//double b; // <<--여기까지가 선언 =하고 값을 넣으면 할당
		double b = a;
		// 3. b를 출력해보세요!
		// int 자료형인 a를 double 자료형으로 선언된 b에 넣어주니까 3.0으로 데이터가 형 변환!
		// int -> double
		// 4byte -> 8byte
		// 자동 형 변환!
		System.out.println(b);
		
		// 1. double 자료형을 담을 수 있는 변수 aa를 선언하세요
		// 	73.2라는 실수형 데이터를 할당
		double aa = 73.2;
		// 2. int 자료형을 담을 수 있는 변수 bb를 선언하세요
		// double(8byte) -> int(4byte)
		int bb = (int)aa; //소괄호에 int를 입력 -> 데이터 유실되어도 상관없다.
		System.out.println(bb); // -> 소수점이 사라짐. 73만 출력
		// 강제(명시적) 형 변환
		// 데이터의 크기가 상대적으로 큰 자료형에서 상대적으로 데이터의 크기가 작은 자료형으로 형변환을 할 때, 앞에 변환하고 싶은 자료형을 명시해줘야 한다!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
