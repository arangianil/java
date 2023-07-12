import java.util.*;
public class SemisterCalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter all sem marks");
		int sem1=sc.nextInt();
		int sem2=sc.nextInt();
		int sem3=sc.nextInt();
		int sem4=sc.nextInt();
		int sem5=sc.nextInt();
		int sem6=sc.nextInt();
		double res=SemisterCalculator.calculatoraverage( sem1,sem2, sem3, sem4, sem5, sem6);
		
		System.out.println(res);
	}

}
