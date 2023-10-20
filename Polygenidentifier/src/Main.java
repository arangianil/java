import java.util.Scanner;

public class Main {
	public static void Polygenidentifier(int sides) {
		switch(sides) {
		case 3:
			System.out.println("triangle");
			break;
		case 4:
			System.out.println("quadrilateral");
			break;
		case 5:
			System.out.println("pentagon");
			break;
		case 6:
			System.out.println("hexagon");
			break;
		case 7:
			System.out.println("hectagon");
			break;
			default:
				System.out.println("polygon");
				break;
		}
	}
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value to identify");
			int sides=sc.nextInt();
			Polygenidentifier(sides);
		}
	}


