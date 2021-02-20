import java.util.*;
class SortArrayByRecursion{

	public static void main(String args[]){
		
		int nums[]={5,2,3,1};
		
		List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        arr=sort(arr);
		int nums1[]=convertIntegers(arr);
		for(int j:nums1){
			System.out.println(j);
		}
		
	}
	
	public static int[] convertIntegers(List<Integer> integers){
		
		int[] ret = new int[integers.size()];
		Iterator<Integer> iterator = integers.iterator();
		for (int i = 0; i < ret.length; i++){
        ret[i] = iterator.next().intValue();
		}
		return ret;
	}
	
	public static List<Integer> sort(List<Integer> arrList){
		
		if(arrList.size()==1)
		return arrList;
		
		//Hypothesis step
		Integer val=arrList.get(arrList.size()-1);
		arrList.remove(val);
		arrList=sort(arrList);
		//Induction Step
		return arrList=insert(arrList,val);
	}
	
	public static List<Integer> insert(List<Integer> arr,int temp){
		
		if(arr.size()==0 || arr.get(arr.size()-1)<=temp){  //if element is present on both the extreme ends
			arr.add(temp);
			return arr;
		}
		Integer val=arr.get(arr.size()-1);   //Removing the largest element to add it after sorting
		arr.remove(val);
		arr=insert(arr,temp);
		arr.add(val);
		return arr;
	}
}