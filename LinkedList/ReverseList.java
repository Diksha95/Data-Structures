import java.util.*;
class ReverseList{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static Node reverse(Node head){
		Node p = head;
		Node q;
        if(head==null)
            return head;
        
        head = p;
        q = p.next;
        if(q == null){  //checking whether list has reached to last node once it has 
						//reached to last node updating head to last node
			return p;
		}
		q = reverse(q);  //iterating to next node;
		p.next.next = p;     //address of second last node
		p.next = null;
        return q;
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
		printLinkedList(reverse(head));
	}

}