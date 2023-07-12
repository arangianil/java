import java.util.Scanner;

public class MsgDecoder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
	int res=decoder.decoder1(ch);
	System.out.println(res);
	}
	public class decoder{
		public static int decoder1(char ch) {
			return (int)ch;
			
		}
	}

}
