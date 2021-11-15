
public class Checker {
     public static boolean isValid(Pair pair) {
    	
    	 
    	 try {
      	    Integer.parseInt(pair.getFirst());
      	    
      	 
         } catch(NumberFormatException N){
      	   System.out.println("first number is invalid"); 
      	   return false;
         }
        
        
         
         try {
           Integer.parseInt(pair.getSecond());
      	  
         }
         catch (NumberFormatException N) {
      	   System.out.println("SEC number is invalid"); 
      	 return false;
         }
         return true;
     }
}
