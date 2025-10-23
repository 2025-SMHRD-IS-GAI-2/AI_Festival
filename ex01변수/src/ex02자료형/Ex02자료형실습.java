package ex02자료형;

public class Ex02자료형실습 {

	public static void main(String[] args) {
		// 1. 논리형 (boolean type)
				// - 키워드 : boolean
				// - 크기 : 1byte
				// - 범위(저장 가능한 데이터) : true, false
				boolean isRainy = false;
				
				// 2. 문자형(Character Type)
				// - 키워드 : char
				// - 크기 : 2byte
				// - 범위 : 0 ~ 65,535(unicode 유니코드 문자 범위)
				char grade = 'A'; 
				// * 문자형은 글자 1개만 저장 가능하다.
				// 글자 1개 이상의 문자열은 아래와 같이 저장!
				// char는 홑따옴표, String은 쌍따옴표!
				String name = "안호성";
				// 3. 정수
				// 1) byte
				//    -키워드 : byte
				// 	  -크기 : 1byte
				//    -범위 : -128 ~ 127
				byte age = 21;
				// 2) short
				//  - 키워드 : short
				//  - 크기 : 2byte
				//  - 범위 : -32,768 ~ 32,767
				short lunchMenu = 12000;
				// 3) int
				//  - 키워드 : int
				//  - 크기 : 4byte
				//  - 범위 : -2,147,483,648 ~ 2,147,483,647
				int lotto = 1_631_432_063;
				// 4) long
				//   - 키워드 : long
				//   - 크기 : 8byte
				//   - 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
				long global = 8_000_000_000L; //숫자 끝에 대문자L을 붙여준다.
				// Long임을 명시할 수 있는 대문자 L 추가!
				
				// 4. 실수(소수점이 있는 숫자)
				//   1) float
				//    - 키워드 : float
				//    - 크기 : 4byte
				//    - 범위 : (+/-)1.4E -45 ~(+/-)3.4028235E38
				float weight = 78.5f;    //double type에서 float으로 변환 할 수 없다.
				// 숫자 뒤에 f를 넣어서 float임을 표시
				
				// 2) double
				//  - 키워드 : double
				//  - 크기 : 8byte
				//  - 범위 : (+/-)4.9E -324 ~ (+/-)1.7976931348623157E308
				double pi = 3.141592;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
