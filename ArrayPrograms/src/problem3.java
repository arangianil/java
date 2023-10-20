import java.util.*;
public class problem3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int arr[]=new int[sc.nextInt()];
	System.out.println("enter the elements of the array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("the positive elements are");
     for(int i=0;i<=arr.length-1;i++) {
	   if(arr[i]>0) {
		System.out.println(arr[i]);
		sc.close();
	}
	}
}
}
