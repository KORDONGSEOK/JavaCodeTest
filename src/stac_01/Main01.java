package stac_01;

import java.util.Scanner;
import java.util.Stack;

public class Main01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
