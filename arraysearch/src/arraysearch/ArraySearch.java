package arraysearch;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements of array");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key to search");
		int target=sc.nextInt();
		Search1 search1=new Search1();
		search1.isPresent(target, arr);
}
}
