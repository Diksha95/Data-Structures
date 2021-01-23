import java.util.HashMap;
class PairOfSongs{

	public static void main(String args[]){
	
		int time[]={30,20,150,100,40};
		
		System.out.println("The number of pairs are "+findDivisibleBy60(time));
	
	}
	
	public static int findDivisibleBy60(int time[]){
		
		int countPair=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int t:time){
		
			if(t % 60==0){
				countPair+=map.getOrDefault(0,0);
			}
			else{
				countPair+=map.getOrDefault(60 - t % 60,0);
			}
			
			map.put(t % 60,map.getOrDefault((t % 60),0)+1);
		}
		return countPair;
	}
}