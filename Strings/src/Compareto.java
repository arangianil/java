
public class Compareto {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="saurav";
		if(s1.compareTo(s2)>0) {
			System.out.println("string 1 is greater than string2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("stirng2 is greater than string1");
		}
		else
		{
			System.out.println("strings are equal");
		}
	}
}
