import java.util.*;
public class String_Replace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string to replace if spaces found");
	String str=sc.nextLine();
	String res=str.replace(" ", "99");
	System.out.println(res);
}
}
