/* https://leetcode.com/problems/linked-list-cycle-ii/  Leetcode Problem 142
   Complexity O(n) 
 */
class StartLoop{

	static class Node{
		Node next;
		int data;
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	//Floyd Cycle Algorithm in single traversal
	public static Node findLoop(Node n){
		Node p = n;
		Node q = n;
		while(p != null && q!= null && q.next!=null){
			p = p.next;
			q = q.next.next;
			if(p == q){
				return p;
			}
		}
		return null;
	}
	
	public static Node startLoopNode(Node p,Node head){
		Node q = head;
		
		if(p ==null)
			return null;
		while(p!=q){
			p = p.next;
			q = q.next;
		}
		return p;
	}
	
	public static void main(String args[]){
		
		Node head = new Node (3);
		head.next = new Node (2);
		head.next.next = new Node(0);
		head.next.next.next = new Node(-4);
		head.next.next.next = head.next;
		//head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = head.next.next;
		Node meetNode = findLoop(head);
		System.out.println("Meet Node "+meetNode.data);
		System.out.println("Start Node "+(startLoopNode(meetNode,head)).data);
		
	}
}