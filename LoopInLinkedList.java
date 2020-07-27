package com.LinkedList;
public class LoopInLinkedList {
	 private Node head;
	 public LoopInLinkedList(){
	  head = null;
	 }
	 static class Node{
	  int value;
	  Node next;
	  Node(int value){
	   this.value = value;
	   this.next = null;
	  }
	 }
	 public void insertLast(Node newNode){
	  if(isEmpty()){
	   head = newNode;
	  }else{
	   Node first = head;
	   while(first.next != null){
	    first = first.next;
	   }
	   first.next = newNode;
	  }
	 }
	 public boolean isEmpty(){
	  return head == null;
	 }
	 public boolean hasLoop(){
	  Node fast, slow; 
	  fast = slow = head;
	  while(slow != null && fast != null && fast.next != null){
	   fast = fast.next.next;
	   slow = slow.next;
	   if(fast == slow){
	    return true;
	   }
	  }
	  return false;
	 }
	 
	 public static void main(String[] args) {
	  LoopInLinkedList list = new LoopInLinkedList();
	  Node node = new Node(30);
	  list.insertLast(new Node(10));
	  list.insertLast(new Node(20));
	  //list.insertLast(node);
	  list.insertLast(new Node(40));
	  list.insertLast(new Node(50));
	  // same node inserted again to create loop
	  list.insertLast(node);
	  System.out.println("Loop detected: " + list.hasLoop());
	 }
	}
