package sortingsearching_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//ÁÂÇ¥Á¤·Ä
class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point obj) {
		if(this.x == obj.x) return this.y - obj.y;
		else return this.x - obj.x;
	}
}
public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<Point>();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
	}
}
