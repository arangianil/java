package encapsulation_examples;
class ex_3App{
	private String name;
	private String color;
	private int age;
	private String breed;
	public ex_3App(String name,String color,int age,String breed) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
}
public class ex_3
{
	public static void main(String[] args) {
		ex_3App d= new ex_3App("puppy","black",2,"dabourmen");
		System.out.println(d.getName()+" "+d.getAge()+" "+
				d.getColor()+" "+d.getBreed());
	}

}
