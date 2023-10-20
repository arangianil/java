
public class Armstrong {
	public int armstrongchecker(int n) {
		int pow=0;
		int n1=n;
		while(n!=0) {
			pow++;
			n=n/10;
		}
		int sum=0;
		while(n1!=0) {
			int c=n1%10;
			sum=sum+(int)Math.pow(c, pow);
			n1=n1/10;
		}
		return sum;
	}

}
