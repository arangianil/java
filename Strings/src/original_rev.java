public class original_rev 
{
	String rev(String str) 
	{
		String arr[]=str.split(" ");
		String revword=null;
		String revString="";
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			char wa[]=word.toCharArray();
			char rwa[]=new char[wa.length];
			int j=rwa.length-1;
			for(int k=0;k<=wa.length-1;k++)
			{
				rwa[j]=wa[k];
				j--;
			}
			revword=new String(rwa);
			revString=revString+revword+" ";
		}
		return revString;
	}
}

