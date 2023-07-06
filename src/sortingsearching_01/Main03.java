package sortingsearching_01;

import java.util.Scanner;
//»ğÀÔÁ¤·Ä
public class Main03 {
	public int[] solution(int n, int[] arr) {
		//11 7 5 6 10 9
		for(int i=1; i<n; i++) {
			int tmp = arr[i], j; //7
			for(j=i-1; j>=0; j--) {
				if(arr[j]>tmp) { //11 > 7
					arr[j+1] = arr[j];//11
				}else {
					break;
				}
			}
			arr[j+1] = tmp; //7
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Main03 T = new Main03();
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
