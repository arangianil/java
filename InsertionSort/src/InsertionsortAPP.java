import java.util.Scanner;

public class InsertionsortAPP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter array elements ");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();

		}
		System.out.println("array elements before sorting......");
		for (int l : arr) {
			System.out.print(l+" ");
		}
		System.out.println();
		InsertionSort.Search(arr);
		System.out.println("array after sorting ...........");
		for (int l : arr) {
			System.out.print(l+" ");
			sc.close();
		}
	}
}
