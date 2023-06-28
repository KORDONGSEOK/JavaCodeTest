package hashMap_03_review;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main02 {
	public String solution(String a, String b) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		//AbaAeCe
		//baeeACA
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char key : b.toCharArray()) {
			if(!map.containsKey(key) || map.get(key) == 0) return "NO";
			map.put(key, map.get(key) - 1);
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main02 T = new Main02();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.print(T.solution(a, b));
	}

}
