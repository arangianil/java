package level4;

public class Solution14 {
	public static void main(String[] args) {
		
		 int rows =3;
			for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                if (k == 1 || k == 2 * i - 1 || i == rows) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        for(int i=0;i<5;i++){
	            for(int j=0;j<5;j++){
	                if(i==0||j==0||i==4||j==4){
	                    System.out.print("* ");
	                }
	                else{
	                    System.out.print("  ");
	                }
	                
	                
	            }
	            System.out.println();

    }
}
}
