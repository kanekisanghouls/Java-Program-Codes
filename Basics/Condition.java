package Basics;

public class Condition {
    public static void main(String[] args) {
        int i, j;
        for (j = 1; j <= 4; j++) // Use ASCII values for char sequence
        {
            for (i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (j = 1; j <= 3; j++) // Use ASCII values for char sequence
        {
            for (i = 3; i >= j; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        Condition a; // reference is created
        a = new Condition(); // object allocation takes place
    }
}
