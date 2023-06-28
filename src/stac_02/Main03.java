package stac_02;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		//0 5 3 5 1 2 1 4
//		0 0 0 0 0
//		0 0 1 0 3
//		0 2 5 0 1
//		0 2 4 4 2	1	
//		3 5 1 3 1     4
		for(int pos : moves) {
			for(int i=0; i < board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
				}
			}			
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main03 T = new Main03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(T.solution(board, moves));
	}

}
