
public class example2 {
	public static void main(String[] args) {
	String s1="rama";
	String s2="sita";
	String s3=s1+s2;
	String s4=s1+s2;
	if(s3==s4) {
		System.out.println("refernces are equal");
	}
	else {
		System.out.println("refernces are not equal");
	}
	if(s3.equals(s4)) {
	System.out.println("strings are equal");
	}
	else {
		System.out.println("strings are not equal");
	}
}
}
