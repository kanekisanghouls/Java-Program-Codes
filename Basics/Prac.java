package Basics;

public class Prac {
	public void add(int num, int num2) // Creating a non static method, so we need to create a object to access this
																		// method. this method is of void type so returns null value.
	{
		int sum = num + num2;
		System.out.println(sum);
	}

	public static void sub(int num, int num2) // Creating a static method so we do not need an object to access this
												// method and this method is of void type.
	{
		int sub = num2 - num;
		System.out.println(sub);
	}

	public static int mul(int num, int num2) // Creating a static method with a integer type method, so we need to
												// return a integer value.
	{
		int mul = num * num2;
		System.out.println(mul);
		return mul;
	}

	public int div(int num, int num2) // Creating a non static method of integer type method, so we need an object to
										// access this method and a return type of integer.
	{
		int div = num2 / num;
		System.out.println(div);
		return div;
	}

	public static void main(String[] args) // Main method where all the above methods are called and used.
	{
		Prac obj = new Prac(); // Creating an object of the class Prac to use the above methods
		obj.add(2, 10); // object calls the add method and provides inputs for its calculation
		sub(2, 6); // we do not have to create an object to access the sub method as it is a static
					// method so we directly call the method itself and provide inputs
		mul(2, 6); // an integer can/ cannot be created to access the method as it is an integer
					// type method and object is not used as it is of static type. you can store
					// that value by creating an integer and storing this called method in that.
		new Prac().div(2, 6); // the method div is non static so object is created and values are passed.
		arun o1 = new arun();
		arun o2 = new arun("Hello");
	}
}

class arun {
	public arun() {
		System.out.println("I am a programmer");
	}

	public arun(String xyz) {
		System.out.println("Haise is");
	}
}
