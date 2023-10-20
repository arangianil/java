package inheritance_examples;

public class Bird {
	public static void main(String[] args) {
		Ex_2_eagle e=new Ex_2_eagle();
		Ex_2_sparrow s=new Ex_2_sparrow();
		System.out.println("-------------------------------------");
		e.name="eagle";
		e.color="golden";
		e.hunt();
		e.fly();
		e.eat();
		System.out.println("-------------------------------------");
		s.name="sparrow";
		s.color="brown";
		s.buildnest();
		s.fly();
		s.eat();
		System.out.println("-------------------------------------");
	}

}
