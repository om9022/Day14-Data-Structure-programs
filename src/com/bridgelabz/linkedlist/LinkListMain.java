package com.bridgelabz.linkedlist;

public class LinkListMain {
	public static void main(String[] args) {
		System.out.println("Welcome to LinkList");
		LinkListService linkList = new LinkListService();
		linkList.add(70);
		linkList.add(30);
		linkList.add(56);
		linkList.print();
	}
}
