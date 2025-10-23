package javafesivalQ;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1;
		
		while(now>=goal) {
			System.out.print(week+"주차 감량 몸무게 : ");
			int num1 = sc.nextInt();
		
			now = now-num1;
			week++;
			
			if(now<goal) {
				break;
			}
		}
		System.out.println(now+"kg 달성!! 축하합니다!");
		
		
		}
	}

