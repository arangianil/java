package tenchecker;
import java.util.*;
public class main {
	public static void checkMultipleOfTen(int n,int m) {
	System.out.println(n%m==0?"multiple of "+n:"not multiple of"+n);	

			// your code here

			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int m=sc.nextInt();
              checkMultipleOfTen(n,m);
			

			}

			}


