package main;

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
	
	public void printLinkedList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.addressOfNextNode;
		}
	}
	
	public void addNode(String data) {
		
	}
	
	public static void main(String[] args) {
		Node node = new Node("1");
		
		Node node2 = new Node("2");
		
		node.addressOfNextNode = node2;
		
		Node node3 = new Node("3");
		
		node2.addressOfNextNode = node3;
		
		LinkedLlistDemo demo = new LinkedLlistDemo();
		demo.printLinkedList(node);
	}
}
