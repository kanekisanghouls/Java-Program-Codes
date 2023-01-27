// POLYMORPHISM & METHOD OVERRIDING 
package Basics;

public class polymorphism {

	private String name;

	public String getname() {
		return name;
	}

	public String toString() {
		return this.getname();
	}

	public polymorphism(String n) {
		this.name = n;
	}

	public static void main(String[] args) {
		polymorphism[] p = new polymorphism[3];
		p[0] = new polymorphism("Tim");
		p[1] = new Student2("Touka", 1234);

		// Example of the compile time rule no 1, where the compiler returns a method
		// signature for polymorphism class to string method, as String toString(). when
		// we run s.toString() at run time it knows that s.toString() actually refers to
		// a
		// student object and finds that method in Student and executes that.

		// In case i try the s.getSID() method it will return a compiler error because
		// the complier only knows method in reference type or class.
		// Again, this can be set by type casting. Like we change from int to double
		// which we call as widening and double to int and call it as narrowing same is
		// done to objects. we can change the superclass reference to subclass reference
		// because we know it will be a runtime reference at the time of run time
		// execution. so we tell the compiler to change the reference
		// So the above becomes ((Student2)s).getSID().

		// you get a java.lang.classcastexception when you try to change the reference
		// as below:
		// Polymorphism p= new polymorphism() to ((Student2)p).getSID() as there is no
		// getSID() method in reference or object class.

		// We can make a runtime check of reference by using is-a or instance of and it
		// checks only in a if loop as follows:
		// if(p instanceof Student2) {
		// only executes if p is-a student2 at runtime
		// (Student2(p)).getSID(); }

		p[2] = new Faculty1("Haise", "ABCD");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}
}

class Student2 extends polymorphism {
	private int studentID;

	public int getSID() {
		return studentID;
	}

	public String toString() {
		return this.getSID() + ":" + super.getname();
	}

	public Student2(String n, int d) {
		super(n);
		this.studentID = d;

	}
}

class Faculty1 extends polymorphism {
	private String employeeID;

	public String getEID() {
		return employeeID;
	}

	public String toString() {
		return this.getEID() + ":" + super.getname();
	}

	public Faculty1(String n, String d) {
		super(n);
		this.employeeID = d;
	}
}

// COMPILE TIME RULES:

/*
 * 1) Compiler knows only reference type, which means that whenever you call a
 * method on an object it only looks at the reference type class of that method
 * and emits a method signature. 2) Can only look in reference type class for
 * method. 3) Outputs a method Signature.
 */

// RUN TIME RULES:

/*
 * 1) Follow exact runtime type of object to find method, i.e superclass object=
 * new subclass(), method in subclass gets executed as it is actual object type.
 * 2) Must match compile time method signature to appropriate method in actual
 * object's class. 
 * 3) In the code below when we run the u.method1() and after the super.method1() is run 
 * there is a confusion as to which method2() will run, either student or undergrad. In 
 * that case as there is no calling object, java inserts this keyword, i.e. this.method2() 
 * and we are calling method 2 on the calling object. now this keyword is going to bind 
 * at runtime and during runtime the actual object of this is taken which is undergrad and 
 * the method2 in undergrad is printed. 
 * in the similar way when super.method1() is compiled we have a calling object in this 
 * case i.e. student and its superclass person so person is compiled instead of undergrad's 
 * superclass student. 
 *
 * Therefore, a call to super and a method is bound to compile time i.e reference type and
 * java is going to look at what class it's in and what's the corresponding superclass and
 * a call to ,this and a method is bound to runtime i.e actual object type and java looks 
 * at the actual object type.
 * 
 * public class Person {
    	public void method1() {
        	System.out.print("Person 1 ");
    	}
    	public void method2() {
        	System.out.print("Person 2 ");
    	}
	}
	
	public class Student extends Person {
    	public void method1() {
        	System.out.print("Student 1 ");
        	super.method1();
        	method2();
    	}
    	public void method2() {
        	System.out.print("Student 2 ");
    	}
	}
	
	public class Undergrad extends Student {
     	public void method2() {
         	System.out.print("Undergrad 2 ");
     	}
     	Person u = new Undergrad();
			u.method1();
	}
 */
