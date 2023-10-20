import java.util.*;
public class Rev_Preserving_Spaces {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string..........");
	String str=sc.nextLine();
     Rev_app r=new Rev_app();
     r.Rev(str);
     sc.close();
	}
}
