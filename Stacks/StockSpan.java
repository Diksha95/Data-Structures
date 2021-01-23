/* https://www.geeksforgeeks.org/the-stock-span-problem/ */
import java.util.*;
class StockSpan{

	static class StockSpanNode{
		
		int price;
		int index;
		
		StockSpanNode(int p,int i){
			this.price=p;
			this.index=i;
		}
	}
	public static void main(String args[]){
		
		int arr[]={100, 80, 60, 70, 60, 75, 85};


		int output[]=getSmallerStock(arr);
		for(int i:output){
			System.out.print(i+" ");
		}
	}
	
	public static int[] getSmallerStock(int arr[]){
		
		Stack<StockSpanNode> s=new Stack<StockSpanNode>();
		int output[]=new int[arr.length];
			
		for(int i=0;i<arr.length;i++){
				
			if(s.size()==0)
				output[i]=-1;
			else if(s.size()>0 && s.peek().price >arr[i]){
				output[i]=s.peek().index;
			}
			else if(s.size () >0 && s.peek().price <=arr[i]){
				
				while(s.size () >0 && s.peek().price <=arr[i])
				{
					s.pop();
				}
				if(s.size()==0){
					output[i]=-1;
				}
				else
					output[i]=s.peek().index;
			}
			StockSpanNode node=new StockSpanNode(arr[i],i);
			s.push(node);
		}
		
		for(int i=0;i<output.length;i++){
			
			output[i]=i-output[i];
		}  
		return output;
	}
}