import java.util.*;
class NearestSmallerRight{
	
	public static void main(String args[]){
		
		int arr[]={4,5,2,10,8};
		
		ArrayList<Integer> arrList=getNSE(arr);
		Collections.reverse(arrList);
		for(int i:arrList){
			System.out.print(i+" ");
		}
		
	}
	
	public static ArrayList<Integer> getNSE(int arr[]){
			
			ArrayList<Integer> arrList =new ArrayList<Integer>();
			
			Stack<Integer> stack=new Stack<Integer>();
			
			for(int i=arr.length-1;i>=0;i--){
				
				if(stack.size()==0)
					arrList.add(-1);
				else if(stack.size() > 0 && stack.peek() < arr[i]){
					arrList.add(stack.peek());
				}
				else if(stack.size() > 0 && stack.peek() >=arr[i]){
					
					while(stack.size() > 0 && stack.peek() >=arr[i]){
						stack.pop();
					}
					if(stack.size()==0)
						arrList.add(-1);
					else
						arrList.add(stack.peek());
				}
				stack.push(arr[i]);
			}
			return arrList;
	}
}