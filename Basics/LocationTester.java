package Basics;

public class LocationTester {
	public static void main(String[] args)
	// Scope of a method is the code inside it and any variable outside it not
	// defined cannot be called unless its a global variable of same calss
	{
		int d;
		SimpleLocation arun = new SimpleLocation(32.9, -117.9);
		// Parameters in java are always passed as value.
		SimpleLocation hyd = new SimpleLocation(12.0, 77.0);
		// Whenever obj1=obj2 the references change and point to
		// same object i.e obj2 hence same values.
		System.out.println(hyd.getlatitude());
		d = 24;
		// Scope of a variable is the area of code where it is defined to have a
		// particular value.
		hyd.setlatitude(d);
		System.out.println(hyd.getlatitude());
	}

}
/*
 * When a variable is declared in java say, int v and a value is assigned to it,
 * what happens is a memory model is created in the back end i.e. imagine it as
 * a box and the value is stored in that box say v=52, so 52 is stored in that
 * box. When an object is created in java say, SimpleLocation obj, an object is
 * declared here of non primitive data type or user defined data type i.e class,
 * objects, arrays etc. when we assign a value to it say, obj= new
 * Simplelocation(32) java allocates some space in the memory called heap for
 * that object. so its creating a new object in that heap. it puts that object
 * at some location in heap which has some address. say this address here
 * is @34. So when this object is created at location @34 it does not place the
 * whole value assigned to the object in the box similar to integer. what it
 * does is it stores that address @34 in that box or a reference in the box for
 * obj so now an arrow is drawn from the box for obj to the location where obj
 * is stored in memory, where the arrow is just a reference to this location
 * which is where the obj is created in heap. so the arrow is the value of the
 * object obj. the value assigned to obj i.e 32 is stored in this location in
 * the space for obj in heap. The class has created a variable and when the
 * object obj is created that variable is stored inside the object and when an
 * object is assogned with value ,here 32, the value is passed to this variable.
 * So whenever an object is created a reference is created which points to the
 * location of that obj in memory where value is stored. so when you try to
 * print a created obj you find the result as a @location. so when we say
 * obj.variable we are refering to the value of variable in the object obj.
 */