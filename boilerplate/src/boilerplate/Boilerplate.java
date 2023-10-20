package boilerplate;
import java.util.Scanner;
public class Boilerplate {
		public static void checkDiscount(double purchaseAmount) 
		{ 
			if(purchaseAmount>100) {
				System.out.println("discount applicable");
			}
		} 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double purchaseAmount=sc.nextDouble();
		  checkDiscount(purchaseAmount);
	}

}

