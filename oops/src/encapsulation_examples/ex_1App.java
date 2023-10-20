package encapsulation_examples;

class ex_1 {
	private int temp;
	public void setTemprature(int x)
	{
		if(x>10 && x<35)
		{
			temp=x;
		}
		else
		{
			System.out.println("invalid");
			
		}
	}
	public int getTemprature()
	{
		return temp;
	}

}
class ex_1App
{
	public static void main(String []args) {
		ex_1 cr=new ex_1();
		cr.setTemprature(28);
		System.out.println(cr.getTemprature());
	}
}
