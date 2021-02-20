class RemoveLoop{

	static Node head;
	static class Node{
		
		int data;
		Node next;
		
		public Node(int d){
		 this.data=d;
		 this.next=null;
			
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
	
	public static void removeLoop(Node head){
       
       if(head == null){
		 return;
	    }
        Node p = head;
        Node q = head;
        Node prev = null;
        boolean isCycle = false;
        while(p!=null && q!=null && q.next!=null){
            prev = p;
            p = p.next;
            q=q.next.next;
            if(p==q){
              isCycle = true;
              break;
            }
        }
        if(isCycle){
           q = head;
           Node temp = p;
           if(p == q){ // when first element forming the cycle
               prev.next = null;
               return;
            }
           while(q != p){
               q = q.next;
               temp = p;
               p = p.next;
            }
            temp.next = null;
    
        }
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
		removeLoop(head);
		printList(head);
		
	}
}