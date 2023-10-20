
public class Duplicate_app {
	void dup(String s1) 
	{
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) 
		{
			for(int j=i+1;j<=ch.length-1;j++) 
			{
				if(ch[i]==ch[j]) 
				{
					ch[i]=' ';
					break;
				}
			}
			if(ch[i]!=' ') 
			{
				System.out.print(ch[i]);
			}
		}

	}

}
