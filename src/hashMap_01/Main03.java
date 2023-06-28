package hashMap_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main03 {
	public List<Integer> solution(int n, int k, int[] arr){
		List<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		//20 12 20 10 23 17 10
		//20 12 20
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1 );
			//key    20 , 12
			//value  2     1
		}
		int lt = 0;
		for(int rt=k-1; rt<n; rt++) {
			//3번째 , 카운트
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			//key     10
			//value    1
			answer.add(map.size()); //key 카운트 value아님
			map.put(arr[lt], map.get(arr[lt]) - 1); //lt 포지션에 있는 값 카운트 다운
			//key    20 , 12
			//value  1     1
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
