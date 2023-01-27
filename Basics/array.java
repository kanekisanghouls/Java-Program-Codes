package Basics;

public class array {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4};
        for (int j : b) {
            System.out.println(j);
        }
        a = new int[5];
        b = new int[7];
        for (int j : b) {
            System.out.println(j);
        }
    }

}
