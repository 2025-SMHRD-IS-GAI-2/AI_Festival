package javafesivalQ;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요. : ");
		int w = sc.nextInt();
		
		if(w<=8) {
			System.out.println("총 임금은 "+(w*5000)+" 입니다.");
		}else {
			System.out.println("총 임금은 "+(int)(8*5000+(w-8)*5000*1.5)+" 입니다.");
		}
		
		
		
		
		
		
		
		
		
	}

}
