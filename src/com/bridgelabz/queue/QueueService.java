package com.bridgelabz.queue;

public class QueueService <T>
{
	Queue<T> head;
	Queue<T> tail;

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
