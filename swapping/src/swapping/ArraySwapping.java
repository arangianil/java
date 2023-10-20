package swapping;

import java.util.Scanner;

public class ArraySwapping {
	private static int i;

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int arr[]=new int[sc.nextInt()];
	System.out.println("enter the elements of the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("the elements are");
     for(int k:arr) {
		System.out.println(k+" ");
     }
     System.out.println("enter two indexes");
     int x=sc.nextInt();
     int y=sc.nextInt();
	 int temp=arr[i];
     arr[x]=arr[y];
     arr[y]=temp;
     System.out.println("after swapping the array elements are");
     for(int i1=0;i1<=arr.length-1;i1++) {
	System.out.println(arr[i1]);	 

}
}
}