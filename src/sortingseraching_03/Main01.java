package sortingseraching_03;

import java.util.Scanner;

//선택정렬 복습
public class Main01 {
	public int[] solution(int n, int[] arr) {
		//13 5 11 7 23 15
		//13 > 5
		for(int i=0; i<n-1; i++) {
			int idx = i;//13,13,11
			for(int j= i+1; j<n; j++) {
				if(arr[j] < arr[idx]) {//7<11
					idx = j; //2-11
				}
			}
			int tmp = arr[i];  //13,13
			arr[i] = arr[idx]; //5,7
			arr[idx] = tmp;    //13,13
			//5 7 11 13
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
