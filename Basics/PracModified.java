package Basics;

public class PracModified {

	public void add(int x, int y) // Creating a non static method, so we need to create a object to access this
									// method. this method is of void type so returns null value.
	{
		int sum = x + y;
		System.out.println(sum);
	}

	public static int sub(int x, int y) // Creating a static method of integer type so integer value is returned and
										// object is not necessary to call method.The output is printed in main body
										// with the use of integer type because if void is used nothing is returned and
										// the output cannot be printed in main method and must be printed in this
										// method itself.
	{
		int sub = y - x;
		return sub;
	}

	public int mul(int x, int y) // Creating a non-static method of integer type so a object is used to call this
									// method and output is printed in main method.
	{
		int mul = x * y;
		return mul;
	}

	public static void div(int x, int y) // Creating a static type method of void type.
	{
		int div = y / x;
		System.out.println(div);
	}

	public static void main(String[] args) {
		PracModified obj = new PracModified(); // the PracModified() is a constructor here. new object obj is created
												// and the contents of class is copied in the object.
		obj.add(23, 56); // object calling add method and passing values.
		System.out.println(sub(23, 56)); // the output is directly printed by giving inputs rather than storing them.
		System.out.println(obj.mul(23, 56)); // the object is printed here directly with values as the method is a non
												// static integer type.
		div(23, 56); // direct method call and value input.
	}
}
/*
 * To create an object you always need a constructor. the constructor decides
 * the space/memory which needs to be allocated to a object. Even if you don't
 * create a constructor, there is a default constructor always present. the
 * constructor always has a class name. A constructor is a member method so it
 * has (). a constructor is always public.It never returns anything so no return
 * type is there
 */
