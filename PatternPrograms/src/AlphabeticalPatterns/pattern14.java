package AlphabeticalPatterns;

public class pattern14 {
	
		public static void main(String[] args)
		{
			int alphabet = 65;
			int rows = 5;
			System.out.println("## Printing the pattern ##");
			for (int i = 1; i <= rows; i++)
			{
				for (int j = 1; j <= i; j++) 
	                        { 
	                                System.out.print((char) (alphabet + j - 1) + " "); 
	                        } 
	                        System.out.println(); 
	                } 
	                for (int i = rows; i >= 1; i--)
			{
				for (int j = 1; j <= i - 1; j++)
				{
					System.out.print((char) (alphabet + j - 1) + " ");
				}
				System.out.println();
			}
		}
	}

