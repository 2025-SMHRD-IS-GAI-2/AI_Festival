package javafesivalQ;

public class Q3 {

	public static void main(String[] args) {
		
		int result=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(-i+" ");
				result = result-i;
			}else {
				System.out.print(i+" ");
				result = result+i;
			}
		}System.out.println();
		System.out.print("결과 : "+result);
		
		
	}
	

}
