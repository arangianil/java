import java.util.*;
public class String_rev{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string..........");
		String s1=sc.next();
		System.out.println("the string before reversed......"+s1);
		char arr[]=s1.toCharArray();
		char[] arr1=new char[arr.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[j]=arr[i];
			j--;
		}
		String s11=new String (arr1);
		System.out.println("the reversd string is......... "+s11);
		sc.close();
	}
}