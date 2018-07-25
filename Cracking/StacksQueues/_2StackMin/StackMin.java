package _2StackMin;

import java.util.Stack;

public class StackMin{ 
	
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> minstack = new Stack<Integer>();
	

	//always push on to stack s
	void push(int n) {
		s.push(n);
		if(min() == null || n <= min()) 
		{
			minstack.push(n);
		}
		
	}
	
	Integer pop() 
	{
		if(s.isEmpty()) {
			return null;
		}
		int n = s.pop();
		if(n == min()) 
		{
			minstack.pop();
		}
		return n;
	}
	
	
	public Integer min() {
		if(minstack.isEmpty()) {
			return null;
		}
		return minstack.peek();
	}
	
	
	
	
}