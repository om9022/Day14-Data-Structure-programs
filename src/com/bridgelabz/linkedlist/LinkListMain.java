package com.bridgelabz.linkedlist;

public class LinkListMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to LinkList");
		LinkListService linkList = new LinkListService();
		linkList.sortAdd(56);
		linkList.sortAdd(30);
		linkList.sortAdd(40);
		linkList.sortAdd(70);
		linkList.printSorted();
	}
}
