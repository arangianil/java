import java.util.Scanner;

public class SumCalc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double sum=0;
	System.out.println("enter the value of n:");
	int n=sc.nextInt();
	calculatesumofseries(n);
		
	}
    public static void calculatesumofseries(int n) {
    	double sum=0;
    	for(double i=1;i<=n;i++) {
    	sum+=1/i;	
    	}
	System.out.println(sum);
}

}
