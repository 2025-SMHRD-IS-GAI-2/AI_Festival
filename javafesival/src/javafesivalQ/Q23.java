package javafesivalQ;

public class Q23 {

	public static void main(String[] args) {
		// 90도 회전
		// [4,0] [3,0] ....
		int num = 1;
		int [][]arr = new int[5][5];
		arr[4][0]=num++; // 1
		arr[3][0]=num++; // 2
		arr[2][0]=num++; // 3
		arr[1][0]=num++; // 4
		arr[0][0]=num++; // 5
		
		arr[4][1]=num++;
		arr[3][1]=num++;
		arr[2][1]=num++;
		arr[1][1]=num++;
		arr[0][1]=num++;
		
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
		arr[0][1]=num++;
	
		
		
		for(int i = 0; i<=5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		for(int i = 6; i<=10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
