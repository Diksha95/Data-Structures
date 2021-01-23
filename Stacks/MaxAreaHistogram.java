import java.util.*;
class MaxAreaHistogram{
	
	static class StackNode{
		int price;
		int index;
		
		StackNode(int v,int i){
			this.price=v;
			this.index=i;
		}
	}
	public static void main(String args[]){
	
	int arr[]={6, 2, 5, 4, 5, 1, 6};
	System.out.println("Maximum area of histogram is "+ findMaxArea(findNSL(arr),findNSR(arr),arr));
	}
	
	//Function to find nearest smaller to left for i
	public static int[] findNSL(int arr[]){
		
		Stack<StackNode> s=new Stack<>();
		int left[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			if(s.size()==0){
				left[i]=-1;
			}else if(s.size() > 0 && s.peek().price < arr[i]){
				left[i]=s.peek().index;
			}else if(s.size() > 0 && s.peek().price >= arr[i]){
				while(s.size() > 0 && s.peek().price >= arr[i]){
					s.pop();
				}
				if(s.size()==0){
					left[i]=-1;
				}else{
					left[i]=s.peek().index;
				}
			}
			StackNode node=new StackNode(arr[i],i);
			s.push(node);
		}
		return left;
		
	}
	 //Function to find nearest smaller to right for i
	public static int[] findNSR(int arr[]){
		
		Stack<StackNode> s=new Stack<>();
		int right[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--){
			
			if(s.size()==0){
				right[i]=arr.length;
			}else if(s.size() > 0 && s.peek().price < arr[i]){
				right[i]=s.peek().index;
			}else if(s.size() > 0 && s.peek().price >= arr[i]){
				while(s.size() > 0 && s.peek().price >= arr[i]){
					s.pop();
				}
				if(s.size()==0){
					right[i]=arr.length;
				}else{
					right[i]=s.peek().index;
				}
			}
			StackNode node=new StackNode(arr[i],i);
			s.push(node);
		}
		//right=reverseArray(right);
		return right;
	}
	
	public static int findMaxArea(int left[],int right[],int arr[]){
		
		int width[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			width[i]=right[i]-left[i]-1;
		}
		int maxArea=0;
		int area[]=new int[arr.length];
		for(int j=0;j<arr.length;j++){
			
			area[j]=arr[j]*width[j];
			if(area[j]>maxArea){
				maxArea=area[j];
			}
		}
		
		return maxArea;
	}
}