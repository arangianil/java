import java.util.*;
public class problem1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length of the array");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements ");
	for(int i=0;i<=arr.length-1;i++) {
	
    arr[i]=scan.nextInt();	
    
}
	for(int i=0;i<=arr.length-1;i++) {
	System.out.print(arr[i]+" ");
	scan.close();
}
}
}
