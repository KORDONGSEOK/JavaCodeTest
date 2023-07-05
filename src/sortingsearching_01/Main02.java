package sortingsearching_01;

import java.util.Scanner;

//버블정렬
public class Main02 {
	public int[] solution(int n, int[] arr) {
		//13 5 11 7 23 15
		//5 11 7 13 15 23
		//5 7 11 13 15 23
		
		for(int i=0; i<n-1; i++) { //턴수 5번 , 2턴
			for(int j=0; j<n-i-1; j++) { //5-0-1:4, 5-1-1:3
				if(arr[j]>arr[j+1]) { //13>5, 13>11, 13>7, 13>23, 23>15
					int tmp = arr[j]; //tmp = 13
					arr[j]=arr[j+1];  //arr[j] = 5
					arr[j+1]=tmp;     //arr[j+1] = 13
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
