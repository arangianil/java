package polymorphism;

public class AnimalApp {
	public static void main(String[] args) {
		Zoo.animal1(new Tiger());
		System.out.println("=============================");
		Zoo.animal1(new deer());
		System.out.println("=============================");
		Zoo.animal1(new monkey());
	}

}
