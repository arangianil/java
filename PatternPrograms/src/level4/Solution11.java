package level4;

public class Solution11 {
public static void main(String[] args) {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        if (i == 0 || i == 3 - 1) {
	          System.out.print("*");
	        }
	        else {
	          if (j == 0 || j == 3 - 1) {
	            System.out.print("*");
	          }
	          else {
	            System.out.print(" ");
	          }
	        }
	      }
	      System.out.println();
	    }
	  }
	
}
