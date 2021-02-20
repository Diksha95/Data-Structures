class LinkedList{
	
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
		
		n=head;
		System.out.print("Printing the list elements :");
		while(n!=null){
			System.out.print("->"+n.data);
			n=n.next;
		}
		System.out.println();
	}
	
	public static int getCount(Node n){
		int length=0;
		while(n!=null){
			length++;
			n=n.next;
		}
		return length;
	}
	public static void insertAtBegin(int newData){
		
		Node temp=new Node(newData);
		temp.next=head;
		head=temp;
	}
	
	public static void insertAtEnd(int newData){
		
		Node temp=new Node(newData);
		Node n=head;
		if(head==null){
			temp=head;
		}
		while(n.next!=null){   //Checking whether traversing is reached till last node or not
			n=n.next;
		}
		n.next=temp;
	}
	
	public static void insertAfterNode(Node previousNode,int newData){
		
		Node temp=new Node(newData);
		Node n=head;
		if(previousNode==null){
			System.out.println("Previous Node cant be null");
			return;
		}
		temp.next=previousNode.next;
		previousNode.next=temp;
	}
	
	public static void insertAtPos(int pos,int newData){
		
		Node temp=new Node(newData);
		Node n=head;
		int length = getCount(n);
		if(pos==0){
			temp=head;
			return;
		}
		if(pos>length){
			System.out.println("Not allowed to insert at this position");
			return;
		}
		if(pos==length){
			insertAtEnd(newData);
		}
		for(int i=0;i<pos;i++){
			n=n.next;
		}
		temp.next=n.next;
		n.next=temp;
	}
	
	public static void deleteAtBegin(Node n){
		n=head;
		head=n.next;
		n.next=null;
		
	}
	
	public static void deleteAtIntermediate(Node delNode){
		Node n=head;
		Node prevNode=null;
		while(n.next!=delNode){
			prevNode = n;
			n=n.next;
		}
		prevNode.next=delNode.next;
		delNode.next=null;
		
	}
	
	public static void deleteAtLast(Node n){
		n=head;
		Node prevNode=null;
		while(n.next!=null){
			prevNode = n;
			n = n.next;
		}
		prevNode.next=null;
		
	}
	
	public static boolean findKey(int keyValue,Node n){
		n = head;
		while(n.next!=null){
			if(n.data==keyValue){
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public static int getNthNode(Node n,int index){
		n = head;
		int count=0;
		while(n!=null){
			if(count==index){
				return n.data;
			}
			count++;
			n = n.next;
		}
		return 0;
	}
	public static void main(String args[]){
		
		head = new Node(5);
		head.next=new Node(10);
		head.next.next=new Node(15);
		head.next.next.next=new Node(20);
		head.next.next.next=new Node(25);
		head.next.next.next.next=new Node(30);
		//printList(head);
		insertAtBegin(4);
		//printList(head);
		insertAtEnd(35);
		//printList(head);
		insertAfterNode(head.next.next,12);
		//printList(head);
		insertAtPos(3,11);
		//printList(head);
		deleteAtBegin(head);
		//printList(head);
		deleteAtLast(head);
		//printList(head);
		deleteAtIntermediate(head.next.next);
		//printList(head);
		//System.out.println(findKey(15,head));
		printList(head);
		System.out.println(getNthNode(head,2));
	}
}