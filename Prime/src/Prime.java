import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check for prime:");
		int n=scan.nextInt();
		boolean res=PrimeNumber(n);
		if(res==true) {	
		System.out.println("the number is prime");
			
		}
	else 
	{
	System.out.println("not prime");	
	}
}
public static boolean PrimeNumber(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}



