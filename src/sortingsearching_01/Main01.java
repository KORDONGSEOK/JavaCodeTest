package sortingsearching_01;

import java.util.Scanner;
//선택정렬
public class Main01 {
	public int[] solution(int n, int[] arr) {
//		           13 5 11 7 23 15
		//idx = 0
		//5 < 13 ? idx = 1 , 11 < 5 ? idx = 1 , 7 < 5 ? idx = 1, 23 < 5 ? idx = 1 , 15 < 5 ? idx=1
		//tmp = 13
		//arr[i] = 5
		//arr[idx] = 13
		//5 13 11 7 23 15
		//idx = 1 , 11 < 13 ? idx=2(11) , 7 < 11 ? idx=3 , 23 < 7 , 15 < 7
		//tmp = 13
		//arr[i] = 7
		//arr[idx] = 13
		//5 7 11 13 23 15
		for(int i=0; i<n-1; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
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
