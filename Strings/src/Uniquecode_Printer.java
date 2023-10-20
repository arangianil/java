import java.util.*;
public class Uniquecode_Printer {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		char arr[]= a.toCharArray();
		for(char x: arr) 
		{
			System.out.print((int)x);
		}
		sc.close();

	}
}
