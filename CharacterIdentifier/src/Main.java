import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character to check for the digit or letter :");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	}
public static void identifyCharacter(char ch) {
	if(Character.isDigit(ch)) {
		System.out.println("entered character "+ch+"is digit");
	}
	else if(Character.isLetter(ch)) {
		System.out.println("entered character "+ch+" is special character");
		
	}
	else {
		switch(Character.toLowerCase(ch)){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("entered character"+ch+"is lower case vowel");
			}
			else {
				System.out.println("entered character"+ch+"is upper case vowel");	
				}
			break;
			
		default:
			if(Character.isLowerCase(ch)) {
				System.out.println("entered character "+ch+"is lower case consonent");
		}
			else {
				System.out.println("entered character "+ch+"is upper case consonent");
			}
		}
	}
	

}
}