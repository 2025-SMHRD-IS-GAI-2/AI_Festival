package javafesivalQ;

import java.util.Arrays;
import java.util.Random;

public class Q10 {
	public static void main(String[] args) {
		//이서커밋 
		int[]arr=new int[8];
		Random rd = new Random();
		
		int max = 0;
		for(int i=0; i<=7; i++) {
			arr[i] = rd.nextInt(100)+1;
			if(arr[i]>max) {
				max = arr[i];
			}
			}
		int min = arr[0];
		for(int i=0; i <=7; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		
		
		System.out.println("배열에 있는 모든 값 : "+Arrays.toString(arr));
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
		
		
	}

}
