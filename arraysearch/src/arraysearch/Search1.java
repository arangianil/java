package arraysearch;

public class Search1 {
public   void isPresent(int target, int[] arr) {
	for(int i=0;i<=arr.length-1;i++) {
		if(target==arr[i]) {
			System.out.println("taget found in array at "+i);
			return;
		}
	}
	System.out.println("target not found");
	
}
}
