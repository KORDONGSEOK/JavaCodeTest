package hashMap_01;

import java.util.HashMap;
import java.util.Scanner;

public class Main01 {
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		//BACBACCACCBDEDE
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int max = 0;
		for(char key : map.keySet()) {
			int cont = map.get(key);
			if(cont > max) {
				max = cont;
				answer = key;
			}
		}
			
		
		return answer;
	}

	public static void main(String[] args) {
		Main01 T = new Main01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.print(T.solution(n, str));
	}

}
