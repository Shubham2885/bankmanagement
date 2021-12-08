package main.queue;

class Node <T> {
	 T data;
	 Node addressOfNextNode;
	
	public Node(T data) {
		this.data = data;
		this.addressOfNextNode = null;
	}
}

public class QueueLinkedList {

	Node head;
	
	public <T> void enqueue(T data) { 
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
	
	public boolean isEmptyQueue() {
		return (head == null);
	}
	
	public void printQueueLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.addressOfNextNode;
		}
	}
	
	public void dequeue() {
		if(!isEmptyQueue()) {
			Node temp = head;
			head = temp.addressOfNextNode;
		}
	}
	
	public static void main(String[] args) {
		QueueLinkedList queueLinkedList = new QueueLinkedList();
		
		System.out.println("Is empty Queue ? =>"+queueLinkedList.isEmptyQueue());
		queueLinkedList.enqueue(23);
		queueLinkedList.enqueue("sdfls");
		queueLinkedList.enqueue(true);
		
		queueLinkedList.printQueueLinkedList();
		
		System.out.println();
		System.out.println("Is empty Queue ? =>"+queueLinkedList.isEmptyQueue());
		
		System.out.println();
		System.out.println("Dequeue Op");
		queueLinkedList.dequeue();
		queueLinkedList.dequeue();
		queueLinkedList.dequeue();
		queueLinkedList.printQueueLinkedList();
	}
}
