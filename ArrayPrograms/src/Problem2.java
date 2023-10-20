import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of the array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the array elements ");
		for(int i=0;i<=arr.length-1;i++) {
		
	    arr[i]=scan.nextInt();		
}
		System.out.println("array contents are.............");
		for(int x:arr) {
			System.out.print(x+5+" ");
			scan.close();
		}
}
}
