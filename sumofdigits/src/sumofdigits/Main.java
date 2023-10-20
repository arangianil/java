package sumofdigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter number to find sum :");
		int n=sc.nextInt();
		while(n>0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println(sum);
		sc.close();
		

}
}