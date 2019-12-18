public class Maxvalue {
	public static void main(String args[]){
	    int array[] = new int[]{9, 6, 5, 7, 8,10};
	    int Maxvalue = getMaxvalue(array);
	    
	    System.out.println("Maxvalue  = "+Maxvalue );
	  }
 public static int getMaxvalue (int[] inputArray){ 
    int MaxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > MaxValue){ 
         MaxValue = inputArray[i]; 
      } 
    } 
    return MaxValue; 
 }
}
