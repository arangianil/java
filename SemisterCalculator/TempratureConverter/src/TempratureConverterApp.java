import java.util.*;
public class TempratureConverterApp {
	public static void main(String[] args) {
		TempratureConverter t1=new TempratureConverter ();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the farenhiet value");
        double farenhiet=sc.nextDouble();
		double res= t1.Temprature_Converter(farenhiet);
		System.out.println(res);
		
	}
	}
		

