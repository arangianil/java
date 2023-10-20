import java.util.Scanner;

public class rar {
	static void Search(int arr[]) {
		int item;
		for(int i=1;i<=arr.length-1;i++) {
			item=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}

	}
	static void Search1(int arr[]) {
		int min;
		int pos;
		int help=0;
		for(int i=0;i<=arr.length-2;i++) {
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min>arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;

		}

	}
	static void search(int arr1[],int key) {

		int low=0;
		int high =arr1.length-1;
		while(low<=high) {
			int mid=(low+high)/2;

			if(arr1[mid]==key) {
				System.out.println("key found at index.......> li09"+mid);
				return;
			}
			else if(key>arr1[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}

		}
		System.out.println("key not found");
	}
	static void Search2(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}}}
	}
	void linearsearch(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("key found at index  "+i);
				return ;
			}

		}
	}
}
