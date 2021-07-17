package com.bridgelabz.linkedlist;

public class LinkListService {
	


	LinkList head;
	SortedLinkedList sortHead;

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

	public void searchNode(int searchData)
	{
		if(head == null)
		{
			System.out.println("The Link List is empty");
		}
		else
		{	
			int countPosition = 1;
			LinkList currentNode = head;
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

	public void delete(int data)
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
			LinkList endNode = head;
			LinkList currentNode = endNode;
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
			LinkList tempNode = head;
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

	//	For Ordered list


	public void sortAdd(int data) 
	{
		SortedLinkedList newNode = new SortedLinkedList();
		newNode.sortData = data;
		newNode.sortNext = null;
		if (sortHead == null) 
		{			
			this.sortHead = newNode;	
		}
		else if(data < sortHead.sortData)
		{
			newNode.sortNext = sortHead;
			sortHead = newNode;
		}
		else
		{
			SortedLinkedList checkNode = sortHead;
			SortedLinkedList previousCheckNode = checkNode;
			while(checkNode.sortNext != null && checkNode.sortData <= data)
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
			System.out.println("The required linklist is");
			while(tempNode.sortNext != null)
			{
				System.out.print(tempNode.sortData+" -> ");
				tempNode = tempNode.sortNext;
			}
			System.out.println(tempNode.sortData);
		}
	}
}
