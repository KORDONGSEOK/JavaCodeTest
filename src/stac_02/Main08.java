package stac_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Main08 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<Person>();
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll(); //    (3,70) (4,80)   (2,50)
			for(Person x : Q) {
				if(x.priority > tmp.priority) {// (3,70) > 
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				answer++; //1,2
				if(tmp.id == m) {
					return answer;
				}
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main08 T = new Main08();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}
