
public class Demo {
	boolean isPalindrome(String s1) {
		char arr[]=s1.toCharArray();
		char[] arr1=new char[arr.length];
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[j]=arr[i];
			j--;
		}
		String s2=new String(arr1);
		if(s1.equalsIgnoreCase(s2)) {
			return true;

		}
		else 
		{
			return false;
		}
	}
}