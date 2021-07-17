package com.bridgelabz.linkedlist;

public class LinkListService {
	


	public LinkList<T> head;
	SortedLinkedList sortHead;

	public void add(T data) 
	{
		LinkList<T> newNode = new LinkList<T>();
		newNode.data = data;
		newNode.next = head;
		this.head = newNode;
		System.out.println("Added Node "+data);
	}

	public void append(T data)
	{
		LinkList<T> newNode = new LinkList<T>();
		newNode.data = data;
		newNode.next = null;
		if (head == null) 
		{			
			this.head = newNode;
		}
		else
		{
			LinkList<T> currentNode = head;
			while (currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		System.out.println("Appended Node "+data);
	}

	public void insertAfter(T afterNodeData , T data)
	{
		LinkList<T> newNode = new LinkList<T>();
		newNode.data = data;
		newNode.next = null;
		if (head == null) 
		{			
			this.head = newNode;
			System.out.println("Added Node "+data);
		}
		else
		{
			LinkList<T> currentNode = head;
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
			LinkList<T> endNode = head;
			LinkList<T> currentNode = endNode;
			while(endNode.next != null)
			{
				currentNode = endNode;
				endNode = endNode.next;
			}
			System.out.println("Node "+endNode.data+" deleted");
			currentNode.next = null;
		}
	}

	public void searchNode(T searchData)
	{
		if(head == null)
		{
			System.out.println("The Link List is empty");
		}
		else
		{	
			int countPosition = 1;
			LinkList<T> currentNode = head;
			while(currentNode.data != searchData && currentNode.next != null)
			{
				currentNode = currentNode.next;
				countPosition++;
			}
			if(currentNode.data == searchData)
			{
				System.out.println(searchData+" Found at Location "+countPosition);
			}
			else
			{
				System.out.println(searchData+" Not Found");
			}
		}
	}

	public void delete(T data)
	{
		if(head == null)
		{
			System.out.println("The Link List is empty");
		}
		else if (head.data == data)
		{
			System.out.println("Node "+head.data+" deleted");
			head = head.next;
		}
		else
		{	
			LinkList<T> endNode = head;
			LinkList<T> currentNode = endNode;
			while(endNode.next != null && endNode.data != data)
			{
				currentNode = endNode;
				endNode = endNode.next;
			}
			if(endNode.data == data)
			{
				currentNode.next = endNode.next;
				System.out.println("Node "+endNode.data+" deleted");
			}
			else
			{
				System.out.println(data+" Not Found");
			}
		}
	}

	public void size()
	{
		if(head == null)
		{
			System.out.println("The Linklist is empty");
		}
		else 
		{	
			int countNode = 1;
			LinkList<T> tempNode = head;
			while(tempNode.next != null)
			{
				countNode++;
				tempNode = tempNode.next;
			}

			System.out.println("The number of nodes are "+countNode);
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
			LinkList<T> tempNode = head;
			System.out.println("The required data  is");
			while(tempNode.next != null)
			{
				System.out.print(tempNode.data+" -> ");
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.data);
			System.out.println("---------------------------------------------------");
		}
	}

	//	For Ordered list


	public  void sortAdd(int  data) 
	{
		SortedLinkedList newNode = new SortedLinkedList();
		newNode.sortData = data;
		newNode.sortNext = null;
		if (sortHead == null) 
		{			
			this.sortHead = newNode;	
		}
		else if(data <= sortHead.sortData)
		{
			newNode.sortNext = sortHead;
			sortHead = newNode;
		}
		else
		{
			SortedLinkedList checkNode = sortHead;
			SortedLinkedList previousCheckNode = checkNode;
			while(checkNode.sortNext != null && checkNode.sortData < data)
			{
				previousCheckNode = checkNode;
				checkNode = checkNode.sortNext;
			}	
			if (data < checkNode.sortData)
			{				
				newNode.sortNext = previousCheckNode.sortNext;
				previousCheckNode.sortNext = newNode;
			}
			else
			{
				checkNode.sortNext = newNode;
			}
		}
		System.out.println("Added Node "+data);
	}

	public void printSorted()
	{
		if(sortHead == null)
		{
			System.out.println("The Linklist is empty");
		}
		else 
		{			
			SortedLinkedList tempNode = sortHead;
			System.out.println("The required Ordered linklist is");
			while(tempNode.sortNext != null)
			{
				System.out.print(tempNode.sortData+" -> ");
				tempNode = tempNode.sortNext;
			}
			System.out.println(tempNode.sortData);
			System.out.println("---------------------------------------------------");
		}
	}
}
