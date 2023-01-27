package Basics;

public class inheritance2 extends Object {

	private String name;

	public inheritance2(String n) {
		this.name = n;
		// super();

		// When i write the above line of code there is a compiler error. That is
		// because the first line in a constructor according to rule 3 as mentioned in
		// the inheritance class, should be a call to the super class constructor.
		// Uncomment the above line of code and you will notice the error.
		// To fix the error just switch the order of above lines.
	}
}

class student1 extends inheritance2 {

	public student1(String n) {
		// super();
		// this.name=n;

		// When i write the above line of code there is a compile error because there is
		// no default no args constructor for super class and the name variable used
		// here is private in the super class and cannot be used here. Instead the below
		// code can be written.

		super(n);
		System.out.println();
		// The above code calls in the default constructor but with args.
	}

	public student1() {

		this("student1");
		// The above code is the default constructor and it points to the constructor
		// with args as mentioned in rule 3 point 1 in inheritance class.
	}
}
