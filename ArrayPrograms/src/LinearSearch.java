import java.util.*;
public class LinearSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of array");
	int arr[]=new int[sc.nextInt()];
	System.out.println("enter the elements of array");
	for (int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("enter key to search");
	int key=sc.nextInt();
	Search search=new Search();
	 search.linearsearch(arr, key);
	 sc.close();
}
}
