
public class MobileApp 
{
	public static void main(String[] args) {
		Mobile mb=new Mobile();
		System.out.println(mb.o.name);
		System.out.println(mb.o.type);
		Charger c=new Charger("black","MI","c-type");
		mb.HasA(c);
		System.out.println("--------------------------------");
		mb=null;
		System.out.println("mobile lost");
		//System.out.println(mb.o.name);
		//System.out.println(mb.o.type);
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getType());
	}

}
