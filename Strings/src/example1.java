
public class example1 {
public static void main(String[] args) {
	String s1="rama";
	String s2=new String("rama");
	if(s1==s2) {
		System.out.println("refernces are equal");
	}
	else {
		System.out.println("refernces are not equal");
	}
	if(s1.equals(s2)) {
		System.out.println("strings are equal");
	}
	else {
		System.out.println("strings are not equal");
	}
}
}
