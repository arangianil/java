package encapsulation_examples;
class ex_2App {
	private int id;
	private String name;
	private int marks;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
public class ex_2{
	public static void main(String[] args) {
		ex_2App Ex=new ex_2App();
		Ex.setId(001);
		Ex.setGender("male");
		Ex.setName("anil");
		Ex.setMarks(50);
		System.out.println(Ex.getId()+" "+Ex.getName()+" "+
				Ex.getGender()+" "+Ex.getMarks());
	}
}
