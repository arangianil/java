package palindrome;

import java.util.Scanner;

public class ReverseApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check for palindrome");
		int n=sc.nextInt();
		Reverse reverse =new Reverse();
		int res=reverse.Digitreverse(n);
		if(n==res) {
			System.out.println("palindrome");
				
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
