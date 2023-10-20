import java.util.Scanner;
public class Length_Checker {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter first string");
	String a=sc.next();
	System.out.println("enter second string");
	String b=sc.next();
	int s1=a.length();
	int s2=b.length();
	if(a==b) {
		System.out.println("the length of two strings are equal");
	}
	else
	{
		System.out.println("the length of strings are not equal ");
	}
}
}
