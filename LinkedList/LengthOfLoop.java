class LengthOfLoop{
 
  static class Node{
		Node next;
		int data;
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	//Printing of singly linked list O(n)
	public static void printList(Node n){
		
		System.out.print("Printing the list elements :");
		while(n!=null){
			System.out.print("->"+n.data);
			n=n.next;
		}
		System.out.println();
	}
	
	public static int findLength(Node p){
		
		Node temp = p;
		int count = 1;
		while(temp.next!=p){
			temp=temp.next;
			count++;
		}
		return count;
	}
	//Floyd Cycle Algorithm in single traversal
	public static int findLoop(Node n){
		Node p = n;
		Node q = n;
		while(p != null && q!= null && q.next!=null){
			p = p.next;
			q = q.next.next;
			if(p == q){
				return findLength(p);
			}
		}
		return 0;
	}
	
	public static void main(String args[]){
		
		Node head = new Node (1);
		head.next = new Node (2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		head.next.next.next.next.next.next.next.next = head.next.next;
		System.out.println("Length of Loop "+findLoop(head));
		
	}
}