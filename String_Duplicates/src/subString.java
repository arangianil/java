import java.util.*;
public class subString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	for(int i=0;i<=s1.length()-1;i++) 
	{
		String temp="";
		for(int j=i;j<=s1.length()-1;j++) 
		{
			temp=temp+s1.charAt(j);
			System.out.println(temp);
			sc.close();
		}
		
	}
	
	}
}
