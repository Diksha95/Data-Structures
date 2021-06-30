/* https://leetcode.com/problems/merge-two-sorted-lists/ */
class MergeSortedLL{
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	//variation of merge sort
	public static Node mergeSorted(Node p,Node q){
		
		//adding a temp node which will be the head of the new sorted list
		Node temp_node = new Node(0);
		
		//this is for mainting the sorted order
		Node s = temp_node;
		
		while(p!=null && q!=null){
			
			if(p.data<=q.data){
				s.next = p;
				p = p.next;
			}else{
				s.next = q;
				q = q.next;
			}
			s = s.next;
		}
		//if one the list is exhausted
		if(p!=null){
			s.next = p;
			p = p.next;
		}
		if(q!=null){
			s.next = q;
			q = q.next;
		}
		//it will give the actual start node
		return temp_node.next;
	}
	
	public static void main(String args[]){
		
		Node head = new Node (10);
		head.next = new Node (50);
		head.next.next = new Node(70);
		head.next.next.next = new Node(90);
		head.next.next.next.next = new Node(100);
		
		
		Node head1 = new Node (20);
		head1.next = new Node (30);
		head1.next.next = new Node(40);
		head1.next.next.next = new Node(60);
		head1.next.next.next.next = new Node(80);
		
		Node s = null;
		s = mergeSorted(head,head1);
		
		while(s!=null){
			System.out.println(s.data+ " ");
			s = s.next;
		}
	}

}