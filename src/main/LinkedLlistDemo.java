package main;

import java.util.Scanner;

class Node {
	
	 String data;
	 Node addressOfNextNode;
	
	public Node(String data) {
		this.data = data;
		this.addressOfNextNode = null;
	}
	
}
public class LinkedLlistDemo {

	 // starting node..
	Node head;
	
	public void printLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.addressOfNextNode;
		}
	}
	
	public void addNode(String data) {
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
		
		printLinkedList();
	}
	
	public void search(String key) {
		Node temp = head;
		int index = 0;
		while(temp != null) {
			index ++;
			if(temp.data.equals(key)) {
				System.out.println(key+" is present at "+index);
				break;
			}
			temp = temp.addressOfNextNode;
		}
	}
	
	public static void main(String[] args) {
//		Node node = new Node("1");
//		
//		Node node2 = new Node("2");
//		
//		node.addressOfNextNode = node2;
//		
//		Node node3 = new Node("3");
//		
//		node2.addressOfNextNode = node3;
		
		LinkedLlistDemo demo = new LinkedLlistDemo();
		Scanner scanner = new Scanner(System.in);
		int x = 1;
		do {
			System.out.println("Enter the value");
			String val = scanner.next();
			demo.addNode(val);
			System.out.println();
			System.out.println("Do want to add more data -> press 1");
			x = scanner.nextInt();
		}while(x == 1);
		
		System.out.println("Enter the value to search ");
		String key = scanner.next();
		
		demo.search(key);
	}
	
	//isEmpty
	//addNodeAtFirstPosition
	//addNodeAtAnyPosition(index,data)
	//addNodeAtLastPosition
	//deleteNodeAtLastPosition
}
