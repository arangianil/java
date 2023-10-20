import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string..................");
		String s1=sc.next();
		Demo d1= new Demo();
		boolean res=d1.isPalindrome(s1);
		if (res==true) {
			System.out.println("entered string is palindrome .........");
		}
		else
		{
			System.out.println("entered string is not palindrome............");	
		}
		sc.close();

	}
}
