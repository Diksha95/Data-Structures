/* https://leetcode.com/problems/implement-queue-using-stacks/
Leetcode :232
*/
import java.util.*;
class QueueUsingStack{

	/** Initialize your data structure here. */
    Stack<Integer> stack ;
    Stack<Integer> temp;
    public QueueUsingStack() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
	
    public void push(int x) {
        if(stack.size()==0)
            stack.push(x);
        else{
            while(!stack.isEmpty()){
                temp.push(stack.pop());
            }
            stack.push(x);
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
     return stack.size() == 0;
    }
	
	public static void main(String args[]){
	
		QueueUsingStack obj = new QueueUsingStack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		int param_2 = obj.pop();
		int param_3 = obj.peek();
		boolean param_4 = obj.empty();
		
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
	}

}