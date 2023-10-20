
public class Rev_app {
	void Rev(String str) {
		char s1[]=str.toCharArray();
		char res[]=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++) {
			if(s1[i]==' ') 
			{
				res[i]=s1[i];
			}
		}
		int j=s1.length-1;
		for(int i=0;i<=s1.length-1;i++)
		{
			if(s1[i]!=' ')
			{
				if(res[j]==' ') 
				{
					j--;
				}
				res[j]=s1[i];
				j--;
			}
			String s2=new String(res);
		}
		System.out.println(res);
	}
	}



