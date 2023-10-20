import java.util.*;
public class arraymerge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int arr1[]=new int[sc.nextInt()];
	System.out.println("enter the length of the second array");
	int arr2[]=new int[sc.nextInt()];
	System.out.println("enter the elements of the first array");
	for(int i=0;i<=arr1.length-1;i++){
		arr1[i]=sc.nextInt();
	}
	System.out.println("enter second array elements");
	for(int j=0;j<=arr2.length-1;j++) {
		arr2[j]=sc.nextInt();
	}
	int arr3[]=new int[arr1.length+arr2.length];
	for(int k=0;k<=arr1.length-1;k++) {
		arr3[k]=arr1[k];
		
	}
	for(int k=0;k<=arr2.length-1;k++) {
		arr3[arr1.length+k]=arr2[k];
	}
	System.out.println("the 3rd array is ");
	for (int l : arr3) {
		System.out.println(l);
		sc.close();
	}
}
}

