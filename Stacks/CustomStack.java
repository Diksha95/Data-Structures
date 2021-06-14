import java.util.*;
class CustomStack {

	List<Integer> stackArr = new ArrayList<Integer>(); 
	int cap;
    public CustomStack(int maxSize) {
        this.cap = maxSize;
    }
    
    public void push(int x) throws Exception{
		if(stackArr.size() < cap ){
			stackArr.add(x);
		}
    }
    
    public int pop() {
        
		return stackArr.isEmpty() ? -1 : stackArr.remove(stackArr.size() - 1);
    }
    
    public void increment(int k, int val) {
        
		for(int i = 0 ; i< k &&	i< stackArr.size();i++){
			
			stackArr.set(i,stackArr.get(i)+val);
		}
    }
	
	public static void main(String args[]) throws Exception{
		
		CustomStack stack = new CustomStack(3);
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		stack.push(2);
		stack.push(3);
		//stack.push(4);
		stack.increment(5,100);
		//System.out.println(stack.pop());
		stack.increment(2,100);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}