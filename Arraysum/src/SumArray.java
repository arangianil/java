import java.util.*;
public class SumArray {
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
	System.out.println("enter the elements of the first array");
	for(int j=0;j<=arr1.length-1;j++){
		arr2[j]=sc.nextInt();
}
int res[]=SumArrayApp.correspondingsum(arr1, arr2);
System.out.println("the 3rd array elements are ====>");
for (int k : res) {
	System.out.print(k+" ");
	sc.close();
}
}

}

