package hashMap_02_review;

import java.util.HashMap;
import java.util.Scanner;

public class Main04 {
	public int solution(String a, String b) {
		int answer = 0;
//		bacaAacba
//		abc
		HashMap<Character, Integer> amap = new HashMap<>();
		HashMap<Character, Integer> bmap = new HashMap<>();
		//a b c
		//1 1 1
		for(char x : b.toCharArray()) {
			bmap.put(x, bmap.getOrDefault(x, 0) + 1);
		}
		//b a
		//1 1
		for(int i=0; i<b.length()-1; i++) {
			amap.put(a.charAt(i), amap.getOrDefault(a.charAt(i), 0) + 1);
		}
		int lt=0;
		for(int rt=b.length()-1; rt<a.length(); rt++) {
			//b a c a
			//1 2 1
			amap.put(a.charAt(rt), amap.getOrDefault(a.charAt(rt), 0) + 1);
			if(amap.equals(bmap)) answer++;
//			bacaAacba
			//b a c
			//0 1 1 
			amap.put(a.charAt(lt), amap.get(a.charAt(lt)) - 1);
			if(amap.get(a.charAt(lt)) == 0) amap.remove(a.charAt(lt));
			//a c
			lt++;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main04 T = new Main04();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.print(T.solution(a, b));
	}

}
