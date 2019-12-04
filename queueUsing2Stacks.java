import java.util.*;
public class Main {
	static Stack <Integer>s1=new Stack<Integer>();
	static Stack <Integer>s2=new Stack<Integer>();
	public static void add(int data) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public static void pop() {
		s1.pop();
	}
	public static void peek() {
		System.out.println(s1.peek());
	}
	public static void main(String[] args) {
		Main qs1=new Main();
		qs1.add(10);
		qs1.add(20);
		qs1.add(30);
		qs1.pop();
		qs1.peek();
	}

}