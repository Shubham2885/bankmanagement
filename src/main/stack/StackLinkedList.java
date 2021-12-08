package main.stack;


class Node <T> {
	 T data;
	 Node addressOfNextNode;
	
	public Node(T data) {
		this.data = data;
		this.addressOfNextNode = null;
	}
}


public class StackLinkedList {

	Node head;
	
	public <T> void push(T data) { 
		Node temp = head;
		
		Node newNode = new Node(data);
		
		if(temp == null) {
			head = newNode;
		}else {
			while(temp.addressOfNextNode != null) {
				temp = temp.addressOfNextNode;
			}
			temp.addressOfNextNode = newNode;
		}
		
//		printLinkedList();
	}
	
	public void pop() {
		Node temp = head;
		Node prev = head;
		
		if(temp.addressOfNextNode == null) {
			head = null;
		}else {
			while(temp.addressOfNextNode != null) {
				prev = temp;
				temp = temp.addressOfNextNode;
			}
			prev.addressOfNextNode = null;
		}
		
	}
	
	public boolean isEmptyStack() {
		return (head == null);
	}
	
	public void printStackLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.addressOfNextNode;
		}
	}
	
	public static void main(String[] args) {
		StackLinkedList stackLinkedList = new StackLinkedList();
		
		System.out.println("Stack is Empty = "+stackLinkedList.isEmptyStack());
		
		stackLinkedList.push(4);
		stackLinkedList.push("Shubham");
		stackLinkedList.push(5.7);
		stackLinkedList.push(true);
		
		stackLinkedList.printStackLinkedList();
		
		System.out.println();
		System.out.println("Stack is Empty = "+stackLinkedList.isEmptyStack());
		
		System.out.println();
		System.out.println("Pop Op");
		stackLinkedList.pop();
		stackLinkedList.pop();
		stackLinkedList.pop();
		
		stackLinkedList.printStackLinkedList();
	}
}
