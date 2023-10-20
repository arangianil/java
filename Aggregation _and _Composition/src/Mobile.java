
public class Mobile {
	Os o=new Os(32,"android");
	Charger ref;
	public void HasA(Charger ref) {
		this.ref=ref;
		System.out.println(ref.getBrand());
		System.out.println(ref.getColor());
		System.out.println(ref.getType());
	}
	

}
