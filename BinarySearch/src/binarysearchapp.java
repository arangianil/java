
public class binarysearchapp {
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
}
