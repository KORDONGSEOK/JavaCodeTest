package hashMap_01;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main05_1 {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
//		Tset.remove(143);
//		System.out.println(Tset.size());
		System.out.println(Tset.last());
		for(int x : Tset) {
			System.out.println(x);		
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main05_1 T = new Main05_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}

}
