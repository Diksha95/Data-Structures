class CompressString {

    public static void main(String[] args) {
        char ch[]={'a','a','b','b','c','c','c'};
        System.out.println("The length of the compressed string is :"+ compress(ch));
    }
    public static int compress(char[] chars) {
       if(chars==null || chars.length==0)
       return 0;
       int pos=0;
       int i=0;
       int count=0;
       while(i<chars.length)
       {
        char current=chars[i];
        while(i<chars.length && chars[i]==current)
        {
            count++;
            i++;
        } 
        chars[pos++]=chars[i-1];
        if(count >1)
        {
             for(char c:(""+count).toCharArray())
             {
                 chars[pos++]=c;
             }
            
        }
        count=0;
       }
      

       return pos;
    }
}




/* 
if(chars==null || chars.length==0) return 0;
		
		int pos = 0;
		int count = 0;
		int i = 0;
		char cur;
		
		while(i<chars.length) {
			cur = chars[i];
			while(i<chars.length && chars[i] == cur) {
				count++;
				i++;
			}
			
			chars[pos++] = chars[i-1];
			if(count > 1) {
                for(char c : (""+count).toCharArray()) 
                {
                    chars[pos++] = c;
                    System.out.println("Value of c  and pos char "+c+chars[pos]);
                }
			}
			count = 0;
		}
		
		return pos; */