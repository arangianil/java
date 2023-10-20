package swapping;
import java.util.*;
public class problem3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array length");
    int arr[]=new int[sc.nextInt()];
    System.out.println("enter the array elements");
    for(int i=0;i<=arr.length-1;i++) {
    	arr[i]=sc.nextInt();
    }
    	printarray.PrintArray(arr);
    }
}
