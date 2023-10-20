import java.util.*;
public class Reverse_org {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to reverse....");
	String str=sc.nextLine();
	original_rev res=new original_rev ();
	String result=res.rev(str);
	System.out.print("the reversed string is ........."+result);
	sc.close();
}
}
