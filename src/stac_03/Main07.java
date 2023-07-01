package stac_03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main07 {
	public String solution(String a, String b) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<Character>();
		for(char x : a.toCharArray()) Q.offer(x);
//		CBA
//		CBDAGE
//		CBA
//		CBDGE
//		CBA
//		CBDGE
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main07 T = new Main07();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
	}

}
