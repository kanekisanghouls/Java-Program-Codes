package Basics;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num1 = input.nextInt();
		System.out.println("\nPlease enter another number: ");
		int num2 = input.nextInt();
		System.out.println("Sum :" + (num1 + num2));
	}

}
