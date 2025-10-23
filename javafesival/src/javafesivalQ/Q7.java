package javafesivalQ;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 지유커밋
		
		System.out.print("행 개수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
			
			}
		
		
		
	}

}
