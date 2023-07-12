package galaticAddition;
import java.util.*;
public class GalaticAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		long result =galaticAddition(num1,num2);
		System.out.println(result);
		sc.close();
	}
	public static long galaticAddition (long num1,long num2) {
		return num1+num2;
	}

}
