/**
 * Name:        Sandra Latt
 * Cruz ID:     slatt
 * Assignment:  GCD
 * Description:  /desc?/
 * Date:        3:11:01 PM Jan 30, 2017
 */
public class GCD {

	public static void main( String[] args ){

	      Scanner sc = new Scanner(System.in);

	      System.out.print("Enter a positive integer: ");
	      int x = sc.nextInt();
	         if (x < 0){
	            System.out.print("Please enter a positive integer: ");
	          
	         }
	      System.out.print("Enter another positive integer: ");
	      int y = sc.nextInt();

	      System.out.print("The GCD of ");
	      System.out.print(x);
	      System.out.print(" and ");
	      System.out.print(y);
	      System.out.print(" is ");
	      System.out.print(+ gcd(x, y));      
	    }

	   private static int gcd(int x, int y){
	      if(y == 0){
	         return x;
	      }
	      return gcd(y, x%y);
	   }


}
