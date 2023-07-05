package sortingseraching_02;

import java.util.Scanner;

public class Main01 {
	public int[] solution(int n, int[] arr) {
		//13 5 11 7 23 15
		//5 13 11 7 23 15
		//5  7  11 13 23 15
		for(int i=0; i<n-1; i++) {
			int idx = i; //13
			for(int j= i+1; j<n; j++) {
				if(arr[j] < arr[idx]) {//11<13,7<11,23<7,15<7  
					idx = j; // 3,
				}
			}
			int tmp = arr[i]; //13
			arr[i] = arr[idx]; //7
			arr[idx] = tmp; //13
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
