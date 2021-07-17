package com.bridgelabz.linkedlist;

public class LinkListService {
	


	LinkList head;

	public void add(int data) 
	{
		LinkList newNode = new LinkList();
		newNode.data = data;
		newNode.next = head;
		this.head = newNode;
	}
	public void print()
	{
		LinkList tempNode = head;
		while(tempNode.next != null)
		{
			System.out.print(tempNode.data+" -> ");
			tempNode = tempNode.next;
		}
		System.out.print(tempNode.data);
	}
}
