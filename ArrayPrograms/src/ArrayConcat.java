import java.util.*;
public class ArrayConcat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of array");
	int arr1[]=new int[sc.nextInt()];
	System.out.println("enter the array elements....");
	for (int i=0;i<=arr1.length-1;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("string concat............");
	int arr2[]=new int[arr1.length*2];
	for (int i=0;i<=arr2.length-1;i++) {
		arr2[i]=arr1[i];
		arr2[i]=arr1[i]+arr1[i];
	}
	System.out.println("array elements are ");
	for (int x : arr2) {
		System.out.println(x);
	}
}
}

