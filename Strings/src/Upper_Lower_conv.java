import java.util.*;
public class Upper_Lower_conv {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		StringBuffer s=new StringBuffer(a);
		for(int i=0;i<=a.length()-1;i++)
			if(Character.isLowerCase(a.charAt(i))) 
			{
				s.setCharAt(i, Character.toUpperCase(a.charAt(i)));

			}
			else if(Character.isUpperCase(a.charAt(i)))
			{
				s.setCharAt(i, Character.toLowerCase(a.charAt(i)));
			}
		System.out.println("string after conversion...........>"+s);
		sc.close();
	}
	

}

