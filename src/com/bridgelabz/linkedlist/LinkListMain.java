package com.bridgelabz.linkedlist;

public class LinkListMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to LinkList");
		//UC1-simple Linked List
		LinkListService<Integer> linkList1 = new LinkListService<Integer>();
		linkList1.add(56);
		linkList1.add(30);
		linkList1.add(70);
		System.out.println("-----------------------------------------------");
		
		//UC2-create Linked List by adding
		LinkListService<Integer> linkList2 = new LinkListService<Integer>();
		linkList2.add(70);
		linkList2.add(30);
		linkList2.add(56);
		linkList2.print();
		
		//UC3-Linked List by appending
		LinkListService<Integer> linkList3 = new LinkListService<Integer>();
		linkList3.append(56);
		linkList3.append(30);
		linkList3.append(70);
		linkList3.print();
		
		//UC4-Ability to insert 30 between 50 and 70
		LinkListService<Integer> linkList4 = new LinkListService<Integer>();
		linkList4.append(56);
		linkList4.append(70);
		linkList4.insertAfter(56,30);
		linkList4.print();
		
		//UC5- Ability to delete the first element in the LinkedList
		LinkListService<Integer> linkList5 = new LinkListService<Integer>();
		linkList5.add(56);
		linkList5.append(70);
		linkList5.insertAfter(56,30);
		linkList5.pop();
		linkList5.print();
		
		//UC6-Ability to delete the last element in the LinkedList
		LinkListService<Integer> linkList6 = new LinkListService<Integer>();
		linkList6.add(56);
		linkList6.append(70);
		linkList6.insertAfter(56,30);
		linkList6.poplast();
		linkList6.print();
		
		//UC7-Ability to search LinkedList
		LinkListService<Integer> linkList7 = new LinkListService<Integer>();
		linkList7.add(56);
		linkList7.append(70);
		linkList7.insertAfter(56,30);
		linkList7.searchNode(30);
		linkList7.print();
		
		//UC8-Ability to insert 40 after 30
		LinkListService<Integer> linkList8 = new LinkListService<Integer>();
		linkList8.add(56);
		linkList8.append(70);
		linkList8.insertAfter(56,30);
		linkList8.insertAfter(30, 40);
		linkList8.print();
		
		//UC9-Ability to delete 40 from the Linked
		LinkListService<Integer> linkList9 = new LinkListService<Integer>();
		linkList9.add(56);
		linkList9.append(70);
		linkList9.insertAfter(56,30);
		linkList9.insertAfter(30, 40);
		linkList9.delete(40);
		linkList9.size();
		linkList9.print();
		
		//UC10-Ability to create Ordered Linked List
 		LinkListService<Integer> sortedLinkList = new LinkListService<Integer>();
		sortedLinkList.sortAdd(56);
		sortedLinkList.sortAdd(30);
		sortedLinkList.sortAdd(40);
		sortedLinkList.sortAdd(70);
		sortedLinkList.printSorted();
	}
}
