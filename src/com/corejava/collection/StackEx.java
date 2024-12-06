package com.corejava.collection;

import java.util.Stack;

public class StackEx 
{
	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>(); 
		
		stack.push("Mahesh");
		stack.push("Bharat");
		stack.push("Param");
		stack.push("Hiren");
		stack.push("Biren");
		
		System.out.println(stack.size());	
		System.out.println(stack);
		
		System.out.println("Pop : "+stack.pop());
		System.out.println(stack);
		
		System.out.println("Peek : "+stack.peek());
		System.out.println(stack);
		
		System.out.println("-----------------------------------");
		
		while(!stack.empty())
		{
			System.out.print(stack.pop()+",");			
		}
	}
}