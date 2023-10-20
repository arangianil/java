import java.util.*;
public class String_count {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter astring to count the frequency of a character");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		for (int i=0;i<=str.length()-1;i++) 
		{
			if(ch[i]!=' ') 
			{
				int count =1;
				for(int j=i+1;j<=str.length()-1;j++) {
					if(ch[i]==ch[j]) 
					{
						count++;
						ch[j]=' ';

					}
				}
				System.out.println(ch[i]+"--->"+count);
			}


		}
	}

}
