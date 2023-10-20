package singleton_d_P;

public class Primeminister {
	static Primeminister pm=null;
	String name;
	int age;
	String gender;
	public Primeminister(String name, int age, String gender) 
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void attendingMeetingWithCM() 
	{
		System.out.println(name+" pm is attending meeting");
	}
	public void maintainGoodRelationshipsWithPM() 
	{
		System.out.println(name+" pm is maintaining the good relationships ");
	}
	public void takeCareOfCountryCitizen() 
	{
		System.out.println(name+" taking care of citizens");
	}
	public static Primeminister getInstance() {
		if(pm==null) {
			pm=new Primeminister("modi", 74, "male");
		}
		return pm;
	}

}
