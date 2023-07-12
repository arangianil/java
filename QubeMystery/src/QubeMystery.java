
import java.util.Scanner;
public class QubeMystery {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	System.out.println("enter the number");
	int i=sc.nextInt();
	int res=cube.cube1(i);
	System.out.println(res);
	}
	public class cube{
		public static int cube1(int i) {
			return i*i*i;
		}
	}

}
