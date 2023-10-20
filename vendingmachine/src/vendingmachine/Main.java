package vendingmachine;

import java.util.Scanner;

public class Main {public static void getProduct(String productCode)

{
	switch(productCode) {
	case "p01":
		System.out.println("maaja");
		break;
	case "p02":
		System.out.println("coce");
		break;
	case "p03":
		System.out.println("thumsup");
		break;
		
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter product code");
String Code=sc.next();
getProduct(Code);

}}


