import java.util.*;
class ReverseIterative{
	
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static void reverseList(Node p){
		
		p = head;
		Stack<Node> s = new Stack<>();
		while(p.next!=null){
			s.push(p);
			p = p.next;
		}
		head = p;   //p has reached till last node 
		while(!s.isEmpty()){
			p.next = s.pop();   //Till only seven elements have been pushed
			p = p.next;
		}
		p.next = null;  //currNode has reached at the starting node and making it null
	}

	public static void printLinkedList(Node head){

		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}
	public static void main(String args[]){
		head = new Node (1);
		head.next = new Node (2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		System.out.println("List before reversal");
		printLinkedList(head);
		System.out.println();
		System.out.println("List after reversal");
		reverseList(head);
		printLinkedList(head);
		System.out.println();
	}
}