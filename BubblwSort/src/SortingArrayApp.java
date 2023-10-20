import java.util.Scanner;

public class SortingArrayApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length ");
	int arr[]=new int[sc.nextInt()];
	System.out.println("enter the arrasy elements");
	for(int i=0;i<=arr.length-1;i++) {
	arr[i]=sc.nextInt();
	}
	System.out.println("array elements before sorting are............");
	for (int k : arr) {
		System.out.println(k+" ");
	}
		SortingArray.Search(arr);
		System.out.println("array elements after sorting.........");
		for (int l : arr) {
			System.out.print(l+" ");
			
}
}
}


