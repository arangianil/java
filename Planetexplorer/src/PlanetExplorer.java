
public class PlanetExplorer {

public double calculateSurfaceArea(double radius)
{
return 4*Math.PI*radius*radius;
}
public class PlanetExplorerApp { 
	public static void main(String[] args) {
PlanetExplorer explorer = new PlanetExplorer(); 
System.out.printf("%.2f",explorer.calculateSurfaceArea(3.0));
}

}
}