import java.util.*;
public class Count_upper_lower {
public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		int c=0;
		int c1=0;
		for(int i=0;i<=a.length()-1;i++) {
		char ch=a.charAt(i);
		boolean res=Character.isUpperCase(ch);
		if(res==true) 
		{
			c++;
		}
		else
		{
			c1++;
		}
	}
		System.out.println("upper count" +c);
		System.out.println("lower count"+c1);
}
}
