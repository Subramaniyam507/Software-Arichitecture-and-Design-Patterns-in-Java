import java.util.Scanner;

public class InputProcessor {
	public static Pair input() {
	System.out.println("Welcome tO SINGLE PRINCIPLE APP");
      Scanner s = new Scanner(System.in);
      
      System.out.println("enter first no");
      String num1 = s.nextLine();
      
      System.out.println("enter sec no");
      String num2 = s.nextLine();
      
      s.close();
      
     
      
      return  new Pair(num1,num2);
	}
}
