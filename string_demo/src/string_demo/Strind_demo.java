package string_demo;
import java.util.*;
public class Strind_demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch[]= new char[10];
		for (int i=0;i<=ch.length-1;i++) {
			ch[i]=scan.next().charAt(0);
		}
		System.out.println("array elements are");
		for (int i=0;i<=ch.length-1;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		System.out.println("COPIED ARRAY ");
		char arr[]=new char[ch.length];
		for (int i=0;i<=ch.length-1;i++) {
			arr[i]=ch[i];
		}
		for(char x:arr) {
			System.out.println(x+" ");
		}
		char arr2[]=new char[arr.length];
		int i=0;
		for(int j=arr.length-1;j>=0;j--) {
			arr2[i]=arr[j];
			i++;
		}
		for(char x:arr2) {
			System.out.print(x+" | ");
		}
	}
}

