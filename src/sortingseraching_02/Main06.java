package sortingseraching_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main06 {
	public ArrayList<Integer> solution(int n , int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		//120 125 152 130 135 135 143 127 160
		//120 125 152 130 135 135 143 127 160
		int[] temp = arr.clone();
		Arrays.sort(temp);
		for(int i=0; i<n; i++) {
			if(arr[i] != temp[i]) answer.add(i+1);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main06 T = new Main06();
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
