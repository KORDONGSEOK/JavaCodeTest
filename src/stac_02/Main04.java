package stac_02;

import java.util.Scanner;
import java.util.Stack;

public class Main04 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		//352+*9-
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}else {
				int rt = stack.pop();
				int lt = stack.pop();
				switch(x) {
					case '+':
						stack.push(rt + lt);
						break;
					case '*':
						stack.push(rt * lt);
						break;
					case '-':
						stack.push(rt - lt);
						break;
					case '/':
						stack.push(rt / lt);
						break;
				}
			}
		}
		answer = stack.get(0);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main04 T = new Main04();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
