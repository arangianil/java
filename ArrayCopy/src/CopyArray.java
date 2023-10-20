import java.util.*;
public class CopyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[]=new int[sc.nextInt()];
		int arr2[]=new int[arr.length];
		System.out.println("enter the elements of array");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
			
		}
		System.out.println("array elements are");
		for (int k : arr) {
			System.out.println(k);
			
		}
		System.out.println();
		System.out.println("array2 contents are");
		for(int j:arr2) {
			System.out.println(j);
		}
}
}