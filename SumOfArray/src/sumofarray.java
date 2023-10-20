import java.util.*;
public class sumofarray {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the length of array");
		int arr[]=new int[sc.nextInt()];
		int arr2[]=new int[arr.length];
		System.out.println("enter the elements of array");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sum of array elements are:");
		for (int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
}
}
