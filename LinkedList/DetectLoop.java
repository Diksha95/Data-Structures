//Complexity O(n) both space and time 
import java.util.*;
class DetectLoop{
	
	static class Node{
		Node next;
		int data;
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	//Floyd Cycle Algorithm in single traversal
	public static boolean findLoop(Node n){
		Node p = n;
		Node q = n;
		while(p != null && q!= null && q.next!=null){
			p = p.next;
			q = q.next.next;
			if(p == q){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		
		Node head = new Node (1);
		head.next = new Node (2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = null;
		System.out.println(findLoop(head));
	}
	
}