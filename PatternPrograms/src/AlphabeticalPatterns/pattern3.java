package AlphabeticalPatterns;

public class pattern3 {
public static void main(String[] args) {	
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
}
}
}
