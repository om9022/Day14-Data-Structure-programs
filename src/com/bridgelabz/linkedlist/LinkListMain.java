package com.bridgelabz.linkedlist;

public class LinkListMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to LinkList");
		LinkListService linkList = new LinkListService();
		linkList.add(56);
		linkList.append(70);
		linkList.insertAfter(56,30);
		linkList.pop();
		linkList.print();
	}
}
