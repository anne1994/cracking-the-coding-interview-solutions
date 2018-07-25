package QueueswithStacks;

import java.util.Stack;

public class QueuewithStack<T>{
	
	Stack<T> s1 = new Stack<>();
	Stack<T> s2 = new Stack<>();
	int top = 0;
	//push it in the end
	void enqueue(T n)
	{
		moveElements();
		s1.push(n);
		top++;
		moveBack();	
	}
	
	void moveBack() 
	{
		while(!s2.isEmpty()) 
		{
		s1.push(s2.pop());
		top++;
		}
	}
	
	void moveElements() 
	{
		while(!s1.isEmpty()) 
		{
		s2.push(s1.pop());
		}
		
	}
	
	public T dequeue()
	{	
		//return recently inserted element in the s1
		if(top > 0)
		{ 
			top--;
			return s1.pop();
		}
		else
		{
			
				throw new IllegalArgumentException("stack empty");
		}
	}
	
	T peek()
	{
		return s1.peek();
	}
	
	boolean empty() {
		return s1.empty() && s2.empty();
	}
	
	
	
}