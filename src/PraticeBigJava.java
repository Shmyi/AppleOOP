import java.util.Scanner;

public class PraticeBigJava {
	public static void main(String[]arg) {
	
		int a;
		int b;
	   	Scanner keyboard = new Scanner (System.in);

		System.out.println("Input a");
		a= keyboard.nextInt();
    	keyboard.nextLine();
    	
    	System.out.println("Input b");
		b= keyboard.nextInt();
    	keyboard.nextLine();
    	
    	int c= max (a, b);
    	System.out.println("Maxium of "+ a +" and "+ b +" is "+ c );
	}	
	  public static int max(int a, int b) {
		  return (a > b) ? a : b;
	}

}