package AlphabeticalPatterns;

public class pattern11 {
	
		public static void main(String[] args)
		{
			int rows = 5;
			System.out.println("## Printing the pattern ##");
			for (int i = 1; i <= rows; i++) 
	                {
	                        for (int j = rows; j >= i; j--)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
	}

