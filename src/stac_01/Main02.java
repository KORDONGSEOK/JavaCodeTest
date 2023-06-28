package stac_01;

import java.util.Scanner;
import java.util.Stack;

public class Main02 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		//(A(BC)D)EF(G(H)(IJ)K)LM(N)
		for(char x : str.toCharArray()) {
			//EF
			if(x == ')') {
				while(stack.pop()!='(');
			}else {
				stack.push(x);
			}
		}
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main02 T = new Main02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
