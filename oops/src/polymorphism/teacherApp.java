package polymorphism;

public class teacherApp 
{
	public static void main(String[] args) 
	{
	Teacher ref;
	ref=new c_teacher();
	ref.Markattendence();
	ref.Teach();
	ref.DoLabPractise();
	System.out.println("==================================");
	System.out.println("----------------------------------");
	ref=new java_teacher();
	ref.Markattendence();
	ref.Teach();
	ref.DoLabPractise();
	System.out.println("==================================");
	System.out.println("----------------------------------");
	ref=new python_class();
	ref.Markattendence();
	ref.Teach();
	ref.DoLabPractise();

}
}