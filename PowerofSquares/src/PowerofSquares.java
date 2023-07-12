import java.util.*;
public class PowerofSquares {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int i=scan.nextInt();
		int res=squares.squares1(i);
		System.out.println(res);
		
	}
	public class squares{
	public static int squares1(int i) {
		return i*i;
	}

}
}
