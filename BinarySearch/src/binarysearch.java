import java.util.*;
public class binarysearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("enter the elements of the first array");
		for(int i=0;i<=arr1.length-1;i++){
			arr1[i]=sc.nextInt();
}
		System.out.println("enter key to search in array");
		int key=sc.nextInt();
		binarysearchapp.search(arr1, key);
	}
}
