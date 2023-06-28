package stac_02;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기
public class Main05 {
	public int solution(String str) {
		int answer = 0;
		//() 레이저 (   ) 쇠막대기
		//()(((()())(())()))(())
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			}else {
				stack.pop();
				if(str.charAt(i-1) == '(') {
					answer += stack.size();
				}else {
					answer++;
				}
			}
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main05 T = new Main05();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
