package hashMap_03_review;

import java.util.HashMap;
import java.util.Scanner;

public class Main04 {
	public int solution(String s, String k) {
		int answer = 0;
		//bacaAacba
//		abc
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x : k.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0) + 1);
			// a b c
			// 1 1 1
		}
		for(int i=0; i<k.length()-1; i++) {
			//bacaAacba
			am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
			// b a
			// 1 1
		}
		int lt=0;
		for(int rt = k.length()-1; rt<s.length(); rt++) {
			am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
			//b a c
			//1 1 1
			if(am.equals(bm)) answer++;
			am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
			//b a c
			//0 1 1
			if(am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
			lt++;
			
		}
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		Main04 T = new Main04();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		System.out.print(T.solution(s, k));
	}

}
