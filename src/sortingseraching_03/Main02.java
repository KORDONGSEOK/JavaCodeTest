package sortingseraching_03;

import java.util.Scanner;

public class Main02 {
	public int[] solution(int n, int[] arr) {
		//13 5 11 7 23 15 횟수
		//5 11 7 13 15 23 첫번째
		//5 7  11 13 15 23 두번째 
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j+1] < arr[j]) {//5 < 13
					int tmp = arr[j+1];//5
					arr[j+1] = arr[j];//13
					arr[j] = tmp;//5
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Main02 T = new Main02();
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
