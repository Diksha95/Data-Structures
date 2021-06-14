class GetNthNode{

	static Node head;
	static class Node {
	
		int val;
		Node next;
		
		Node (int data){
			this.val= data;
			this.next = null;
		}
	}

	public static void getNthNode(Node head , int n){
	
		Node temp = head;
		int leng = 0;
		
		while(temp!= null){
			temp = temp.next;
			leng++;
		}
		
		temp = head;
		
		for(int i = 0 ; i< leng - n;i++){
			temp = temp.next;
		}
		System.out.println(temp.val);
	}
	
	public static void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	
	public static void main(String args[]){
		
		int n = 3;
        for (int i = 0; i < 7; i++) {
            push(i);
        }
		
        getNthNode(head,3);
		
		while(head!=null){
			System.out.print("->"+head.val);
			head = head.next;
		}
	}
}