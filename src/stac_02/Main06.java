package stac_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main06 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) Q.offer(i);
		//12345678
		while(!Q.isEmpty()) {
			for(int i=1; i<k; i++) {//7
				Q.offer(Q.poll());
			}
			Q.poll();//3615284
			if(Q.size() == 1) {//7
				answer = Q.poll();
			}
		}
		
		return answer;		
	}
	
	public static void main(String[] args) {
		Main06 T = new Main06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
	}

}
