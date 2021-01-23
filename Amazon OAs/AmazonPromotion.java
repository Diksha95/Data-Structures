class AmazonPromotion{

	public static void main(String args[]){
		
		String [][]codeList = {{"apple", "apple"}, {"banana","anything","banana"}};
		String []shoppingCart = {"banana","orange","banana","apple","apple"};
		
		System.out.println("Customer is winner " +checkWinner(codeList,shoppingCart));
	}
	
	public static int checkWinner(String [][]codeList,String []shoppingCart){
		
		String shoppingCartList = String.join("",shoppingCart);
		
		int n=codeList.length;
		String cList []=new String[n];
		for(int i=0;i<n;i++){
			
			cList[i]=String.join("",codeList[i]);
			
			//Replacing anything with regex wild card it can be anything
			cList[i]=cList[i].replace("anything","[a-zA-Z]+");
			
			
			String removeUpto="REMOVEUPTO";
		
		//To ensure that we have found the regex in shopping cart upto this place
		shoppingCartList=shoppingCartList.replaceFirst(cList[i],removeUpto);
		
		int indexRemoveUpto=shoppingCartList.indexOf(removeUpto);
		if(indexRemoveUpto>=0){
			shoppingCartList=shoppingCartList.substring(indexRemoveUpto+removeUpto.length(),shoppingCartList.length());
		}
		else {
			return 0;
		}
		
		}
		
		return 1;
		
	}
}