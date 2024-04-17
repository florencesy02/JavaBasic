package chap02;

public class Charstack {
	private char[] stack;
	private int top;
	private int capacity;
	
	public CharStack(int capacity) {
		this.capacity = capacity;
		stack = new char[capacity];
	}
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == capacity;
	}
	
	public boolean push() {
		return 
	}
}
