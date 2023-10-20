import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		if(str1.length()==str2.length())
		{
			Anagram_App theAnagram=new Anagram_App();
			boolean res=theAnagram.isAnagram(str1, str2);
			if(res==true)
			{
				System.out.println("Entered Strings Are Anagrams");
			}
			else
			{
				System.out.println("Entered Strings Are Not Anagrams");
			}
		}
		else
		{
			System.out.println("Strings Are Not Anagrams");
		}
		scan.close();
	}
}