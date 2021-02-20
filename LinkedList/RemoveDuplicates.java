/* https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1#*/
import java.util.*;
class RemoveDuplicates{

    static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
    public static void printLinkedList(Node head){

		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}
	//Complexity O(n) but used extra space
    public static void removeDup(Node p){
        Set<Integer> s = new LinkedHashSet<>();
        while(p!=null){
            s.add(p.data);
            p = p.next;
        }
        System.out.println(s);
    }
	//Complexity O(n) in o(1) space
	public static void removeDup2(Node p){
		p = head;
		while(p.next!=null){
			if(p.data == p.next.data){
				p.next=p.next.next;
			}else{
				p = p.next;
			}
			
		}
	}

    public static void main(String args[]){

        head = new Node (11);
		head.next = new Node (11);
		head.next.next = new Node(11);
		head.next.next.next = new Node(21);
		head.next.next.next.next = new Node(43);
		head.next.next.next.next.next = new Node(43);
		head.next.next.next.next.next.next = new Node(43);
		head.next.next.next.next.next.next.next = new Node(60);
		System.out.println("List before reversal");
		printLinkedList(head);
		System.out.println();
		System.out.println("List after reversal");
		//removeDup(head);
		//printLinkedList(head);
		System.out.println();
		removeDup2(head);
		printLinkedList(head);
		
    }
}