package com.FIFO;

import java.io.*; 
import java.util.*; 
  
public class LILO { 
   
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();

		stack.push("A");	
		stack.push("B");	
		stack.push("C");	
		stack.push("D");	

	
		
		System.out.println("Top element is: " + stack.peek());

		 
	
		System.out.println("C is present at " + stack.search("C") + 
							" positions from top");
		System.out.println("B is present at " + stack.search("B") + 
				" positions from top");
		System.out.println("A is present at " + stack.search("A") + 
				" positions from top");
		
			
		System.out.println("Stack size is " + stack.size());

	
		
	}



	
}