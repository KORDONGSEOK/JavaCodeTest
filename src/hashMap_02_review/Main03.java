package hashMap_02_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main03 {
	public List<Integer> solution(int n , int k, int[] arr){
		List<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		//20 12 20 10 23 17 10
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			//key : 20 12
			//value 2  1
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			//key : 20 12  10  23
			//value  1  1   1   1
			answer.add(map.size()); // 매출액종류 담기 3
			map.put(arr[lt], map.get(arr[lt]) - 1);
			//key : 20 12  10
			//value  1  1   1
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main03 T = new Main03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

}
