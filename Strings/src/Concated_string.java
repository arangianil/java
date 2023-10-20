import java.util.*;
public class Concated_string {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter first string");
	String a=sc.next();
	System.out.println("enter second string");
	String b=sc.next();
	if(a.equals(b)) {
		System.out.println(a+b);
	}
	else
	{
		System.out.println("strings are not equal....");
	}
}
}
