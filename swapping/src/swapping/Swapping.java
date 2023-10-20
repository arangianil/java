package swapping;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping the numbers are "+a+" and "+b);
		int help=a;
		a=b;
		b=help;
		System.out.println("after swapping the numbers are "+a +" and " +b);
	}

}
