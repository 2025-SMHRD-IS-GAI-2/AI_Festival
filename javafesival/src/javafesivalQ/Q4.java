package javafesivalQ;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		System.out.print("총 금액 입력 : ");
		Scanner sc = new Scanner(System.in);
		int rest = sc.nextInt();
		
		System.out.println("잔돈 : "+rest+"원");
		System.out.println("만원 : "+rest/10000+"장");
		System.out.println("5천원 : "+(rest%10000)/5000+"장");
		System.out.println("천원 : "+((rest%10000)%5000)/1000+"장");
		System.out.println("5백원 : "+(((rest%10000)%5000)%1000)/500+"개");
		System.out.println("백원 : "+((((rest%10000)%5000)%1000)%500)/100+"개");
	}

}
