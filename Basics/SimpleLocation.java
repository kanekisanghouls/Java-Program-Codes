package Basics;

public class SimpleLocation extends Object {
	private double latitude; // I have changed the type of the variable as private, which means that i cannot
								// use this variable outside this class or change it.
	private double longitude; // these are global(member) variables and can be used anywhere inside the class.

	public SimpleLocation(double lat, double lon) // parameter passed in a method are local variables.
	{
		this.latitude = lat; // as the variables latitude and longitude are private, once the constructor
								// takes in values from the user or sets them they cannot be changed. this type
								// of access is used when the user wants design control over his class and does
								// not want the input user to change values or not see them.
		this.longitude = lon;
	}

	public double getlatitude() // This is called a getter which provides limited access to the user. it takes
								// the value of latitude from this class and it exposes that value to other
								// classes when called. This allows the user to just see value of the variable
								// and not change it.
	{
		return this.latitude;
	}

	public void setlatitude(double lat) // This is called a setter which provides the user with the option to change the
										// value of the private variable latitude. But we want to allow the user with
										// option to change the value of the variable only if it is in legal limits so
										// we use the if statements and set the setter type else we could have made the
										// variable public.
	{
		if (lat < -180 || lat > 180) {
			System.out.println("Illegal value of latitude");
		} else {
			this.latitude = lat;
		}
	}
}
