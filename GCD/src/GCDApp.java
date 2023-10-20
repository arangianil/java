import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers to check gcd");
		int m=sc.nextInt();
		int n=sc.nextInt();
	int res=findGCD(m, n);
		System.out.println("gcd of "+m+" and "+n+"is"+m);
		
	}


	public static int findGCD(int m, int n) {
		
	while(n!=0) {
		int rem=m%n;
		m=n;
		n=rem;
	}
	int gcd=m;
	return gcd;
}
}

