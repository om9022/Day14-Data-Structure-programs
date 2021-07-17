package com.bridgelabz.stack;

import java.util.LinkedList.LinkListService;

public class StackService<T>{
	LinkListService<T> linkedList= new LinkListService<T>();
	public void push(T data) {
		linkedList.add(data);
	}
	public void print() {
		linkedList.print();
	}
	
}
