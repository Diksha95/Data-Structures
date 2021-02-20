/*  https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
Complexity will be O(n) */
import java.util.*;
class RemoveDuplicatesUns{

	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static void removeDup(Node p){
		p = head;
		Node prev = null;
		Set<Integer> s = new LinkedHashSet<>();
        while(p!=null){
			if(s.contains(p.data)){
				prev.next = p.next;
			}else{
				s.add(p.data);
				prev = p;
			}
			
			p = p.next;
        }
	}
	
	public static void printLinkedList(Node head){

		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}
	
	public static void main(String args[]){

        head = new Node (12);
		head.next = new Node (11);
		head.next.next = new Node(12);
		head.next.next.next = new Node(21);
		head.next.next.next.next = new Node(41);
		head.next.next.next.next.next = new Node(43);
		head.next.next.next.next.next.next = new Node(21);
		head.next.next.next.next.next.next.next = new Node(60);
		System.out.println("List before reversal");
		printLinkedList(head);
		System.out.println();
		System.out.println("List after reversal");
		System.out.println();
		removeDup(head);
		printLinkedList(head);
		
    }
}