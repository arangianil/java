package singleton_d_P;

public class ObjectCount {
	    private static int objectCount = 0;

	    public ObjectCount() {
	        objectCount++;
	    }

	    public static int getObjectCount() {
	        return objectCount;
	    }

	    public static void main(String[] args) {
	        ObjectCount obj1 = new ObjectCount();
	        ObjectCount obj2 = new ObjectCount();
	        ObjectCount obj3 = new ObjectCount();
	        ObjectCount obj4 = new ObjectCount();
	        ObjectCount obj5 = new ObjectCount();
	        ObjectCount obj6 = new ObjectCount();

	        System.out.println("Number of objects created: " + ObjectCount.getObjectCount());
	    }
	}
