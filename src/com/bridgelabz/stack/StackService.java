package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkListService;

public class StackService<T>{
	LinkListService<T> linkedList= new LinkListService<T>();
	public void push(T data) 
	{
		linkedList.add(data);
	}
	public void print()
	{
		linkedList.print();
	}
	public void peak()
	{
		System.out.println("The data at the top of stack is "+ linkedList.head.data);

	}
	public void pop()
	{
		linkedList.pop();
	
}
