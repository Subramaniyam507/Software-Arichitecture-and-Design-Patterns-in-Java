
//single responsiblility PRINCIPLE SAYS each CLASS or methods should have one reason
//if a given class or methods does more than one task ^then it is violation of single responsibility
//principlE we use interfaces to do achieve this
//loose coupling can be achieved
//TIGHt COUPLING
// classes are highly dependent on each other
//this happens when the classes have too many responsibilities
//LOOSE COUPLING
//classes are independent of each other
// interfaces are used to achieve this
// it can be done with help of the solid principles
import java.util.*;
public class SingleResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     
		Pair pair =InputProcessor.input();
       
    if(Checker.isValid(pair) == true) {
    
    	  System.out.println("SUM:  " + Operation.add( Integer.valueOf( pair.getFirst()) , Integer.valueOf(pair.getSecond() ))  );
    	    System.out.println( "END Of  application "  );
    	} 
    
	}
    
  

}
