package com.bridgelabz.linkedlist;

public class LinkListService {
	

	LinkList head;

	public void add(int data) 
	{
		LinkList newNode = new LinkList();
		newNode.data = data;
		newNode.next = head;
		this.head = newNode;
		System.out.println("Added Node "+data);
	}

	public void append(int data)
	{
		LinkList newNode = new LinkList();
		newNode.data = data;
		newNode.next = null;
		if (head == null) 
		{			
			this.head = newNode;
		}
		else
		{
			LinkList currentNode = head;
			while (currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		System.out.println("Added Node "+data);
	}

	public void insertAfter(int afterNodeData , int data)
	{
		LinkList newNode = new LinkList();
		newNode.data = data;
		newNode.next = null;
		if (head == null) 
		{			
			this.head = newNode;
			System.out.println("Added Node "+data);
		}
		else
		{
			LinkList currentNode = head;
			while (currentNode.data != afterNodeData && currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			if(currentNode.data != afterNodeData)
			{
				System.out.println(afterNodeData+" Not found ");
			}
			else 
			{				
				newNode.next = currentNode.next;
				currentNode.next = newNode;
				System.out.println("Added Node "+data);
			}

		}

	}

	public void pop()
	{
		if(head == null)
		{
			System.out.println("There is nothing to pop");
		}
		else 
		{	
			System.out.println("Node "+head.data+" deleted");
			head = head.next;
		}
	}

	public void poplast()
	{
		if(head == null)
		{
			System.out.println("There is nothing to pop");
		}
		else 
		{
			LinkList endNode = head;
			LinkList currentNode = endNode;
			while(endNode.next != null)
			{
				currentNode = endNode;
				endNode = endNode.next;
			}
			System.out.println("Node "+endNode.data+" deleted");
			currentNode.next = null;
		}
	}


	public void print()
	{
		if(head == null)
		{
			System.out.println("The Linklist is empty");
		}
		else 
		{			
			LinkList tempNode = head;
			System.out.println("The required linklist is");
			while(tempNode.next != null)
			{
				System.out.print(tempNode.data+" -> ");
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.data);
		}
	}
}
