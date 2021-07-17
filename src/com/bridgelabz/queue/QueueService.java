package com.bridgelabz.queue;

public class QueueService <T>
{
	Queue<T> head;
	Queue<T> tail;
	//to add element in queue
	public void enqueue(T data) 
	{
		Queue<T> newNode = new Queue<T>();
		newNode.data =  data;
		newNode.next = null;
		if(head == null)
		{
			this.head = newNode;
			this.tail = newNode;
		}
		else 
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	//to delete element in queue
	public void dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{			
			Queue<T> deletedNode = head;
			head = head.next;
			System.out.println("\n Deleted element "+deletedNode.data);
		}
	}
	
	//to display all the elements in queue
	public void print() 
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.print("The queue is ");
			Queue<T> traverseNode = head;
			while (traverseNode != null) 
			{
				System.out.print(traverseNode.data +" ");
				traverseNode = traverseNode.next;
			}
		}
	}
}
