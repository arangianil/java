import java.util.*;
public class count {
		static final int max_char= 256;

		static void getOccurringChar(String str)
		{
			int count[] = new int[max_char];

			int len = str.length();
			for (int i = 0; i < len; i++)
				count[str.charAt(i)]++;
			char ch[] = new char[str.length()];
			for (int i = 0; i < len; i++) {
				ch[i] = str.charAt(i);
				int find = 0;
				for (int j = 0; j <= i; j++) {
					if (str.charAt(i) == ch[j])
						find++;
				}

				if (find == 1)
					System.out.println( str.charAt(i)+"----->" + count[str.charAt(i)]);
			}
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter a string to count the values......");
			String str =sc.nextLine();
			getOccurringChar(str);
		}
	}


