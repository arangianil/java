package swapping;

public class printarray {
public static void PrintArray(int arr[]) {
	System.out.println("forward array");
	for (int a : arr) {
		System.out.println(a+" ");
	}
	System.out.println("reverse array");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]+" ");
	}
}
}
