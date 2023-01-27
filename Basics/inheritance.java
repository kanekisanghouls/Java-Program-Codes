package Basics;

public class inheritance {

	public static void main(String[] args) {

		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();

		String n = s.getname();
		// This above code runs fine without any compile time or run time error even if
		// there is no get name method in student because student extends person.
		p = s;
		// This above code also runs fine because the reference of the object p points
		// to the location of student object i.e. Person p= new person() now becomes
		// Person p =new Student(); The reference person p now refers to a student
		// object.
		// int m=p.getID();
		// This above returns an error in spite of running p=s where the person p now
		// refers to a student object because the compiler doesn't know the object type
		// of p it only knows that the reference type is Person and there is not getID
		// in person class. This can be sorted by type casting as below.
		int m = ((Student) p).getID();
		// f = q;
		// The above code returns an error because when we change Faculty f= new
		// person() , every person is not a faculty. So we cannot point reference of
		// faculty to object type person.
		o = s;
		// The above code will work because the object o is of reference type Object and
		// in java object type references can point to any object types as everything is
		// an object in java.
	}
}

class Person {
	private String name;

	public String getname() {
		return name;
	}
}

class Student extends Person {
	private int id;

	public int getID() {
		return id;
	}
}

class Faculty extends Person {
	private String id;

	public String getID() {
		return id;
	}
}

// VISIBILITY MODIFIERS
class Sample {

	public int w;
	/*
	 * Public variable can be accessed from anywhere, be it same class, same
	 * package, sub class, or class from other package or sub class from other
	 * package.
	 */

	protected int x;
	/*
	 * Protected variable can be accessed from anywhere except for the exception
	 * from classes not in the same package.Sub classes from other classes can still
	 * access it.
	 */

	int y;
	/*
	 * Package variables can be accessed within the same package be it class or sub
	 * classes within the same package. Classes and sub classes outside the package
	 * cannot access package variables.
	 */

	private int z;
	/*
	 * Private variables are the most restrictive and can be accessed only within
	 * the same class.
	 */
}

//COMPILER RULES
class bot {
	private String name;

}

	/* When this piece of code is written in high level human program language it is
	 * sent to compiler to be converted into Bytecode i.e computer understandable by
	 * changing the code a bit, which is then sent to JVM to run.
	 */
	
	/*
	 * There are three rules the compiler follows. 
	 * 1) If there is no superclass the
	 * compiler gives you one by extending object. i.e. public class arun extends
	 * Object. this is called implicit insertion. 
	 * 2) If there is no constructor
	 * specified in java, java automatically gives you a default constructor. 
	 * 3) after a default constructor is provided java applies few constructor specific
	 * rules which are, 
	 * The first line of constructor must contain this keyword with
	 * arguments in it, i.e 
	 * 1st line, 
	 * 		this(args), so calls a another constructor within the same class, 
	 * or, 
	 * 		super(args), or call a parent class/ super class constructor 
	 * otherwise java inserts: 
	 * 		super(), java inserts a call to the default constructor of your super class.
	 */
	
	/*
	 * so the above piece of code changes to this
	 *  
	 * public class bot extends Object { 				1st rule. 
	 * 
	 *		 private String name;
	 * 
	 * 		 public bot() { 							2nd rule.
	 * 			super(); 								3rd rule. this must always be the first line of the constructor and any code must be written after this.
	 * 		} 
	 * }
	 */



