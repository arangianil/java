import java.util.Scanner;

public class ArmstrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check for armstrong or not");
		int n=scan.nextInt();
		Armstrong armstrong=new Armstrong();
		int res=armstrong.armstrongchecker(n);
		
	if(res==n) {
		System.out.println("armstrong");
		
	}else {
		System.out.println("not armstrong");
	}
		
	}

}
