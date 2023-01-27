package Strings;

public class StringBasics {
   public static void main(String[] args) {
      String test = new String("Hello World!");
      String test2 = test;
      System.out.println(test);
      /*Strings are objects in java and are not primitive types, they are represented in the heap. the above variable test creates a new object in the memory
        and the variable test refers to that variable. the variable test 2 also refers to the same object. Strings in java are immutable that is they cannot
        changed.*/
      test2 = test + " Good day";
      System.out.println(test2);
      /* The above line appends the word good day to test 2 and creates a new object in the memory and does not refer to the test object */
      test2 = test.concat(" Wonderful day");
      System.out.println(test2);
      /* In java a string in this case test is stored as an array of characters */
      String test3 = "Hello World!";
      String test4 = "Hello World!";
      /* This above is called interned strings, where java creates a object for you implicitly when you initialize a string. When you don't explicitly call
      the new string key word this happens internally. the variables test3 and test4 point to the same object in the heap */
      System.out.println(test.equals(test3)); // This returns true as the equals method compares the characters in the string and is an inbuilt string method.
      if (test3 == test) {
         System.out.println("true");  // This returns false as the == operators compares the two variables and the variables store the references to the objects in the heap
      } else {
         System.out.println("false");
      }
   }
}
