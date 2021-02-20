class TOHRecursive{

	public static void main(String args[]){
	
	int n=3;
	int source=1;
	int helper=2;
	int des=3;
	
	System.out.println(toh(n,source,des,helper));
	}
	
	public static long toh(int N, int from, int to, int aux) {
     
       printTOH(N,from,to,aux);
       return (long)(Math.pow(2,N)-1);
    }
    
    public static void printTOH(int N, int from, int to, int aux){
         if(N==1){
            move(N,from,to);
            return ;
        }
        
        toh(N-1,from,aux,to);
        move(N,from,to);
        toh(N-1,aux,to,from);
    }
    public static void move(int N,int from,int to){
        
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
    }
}