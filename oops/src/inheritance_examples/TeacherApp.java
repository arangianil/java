package inheritance_examples;

public class TeacherApp {
	public static void main(String[] args) {
		physics p=new physics();
		chemistry c=new chemistry();
		biology b=new biology();
		p.name="laxman";
		p.type="soft nature";
		p.markattendence();
		p.teaches();
		p.dolawexp();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		c.name="narishma";
		c.type="rude nature";
	    c.markattendence();
	    c.teaches();
	    c.dochemicalexp();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		b.name="meenakshi";
		b.type="kind hearted";
        b.markattendence();
        b.teaches();
        b.dodisectionexp();  
	}

}
