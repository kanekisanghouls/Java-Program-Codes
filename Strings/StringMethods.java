package Strings;

public class StringMethods {
   public static void main(String[] args) {
      System.out.println(hasLetter("Arun", 'u'));
      System.out.println(hasChar("Arun", 'u'));
      String text = "Hello there he is present";
      char ch = 't';
      int index = text.indexOf(ch); // In built method in the string class instead of hasChar or hasLetter
      int index2 = text.indexOf("he");
      int index3 = text.indexOf("He");
      System.out.println(index);
      System.out.println(index2);
      System.out.println(index3);
      String[] words = text.split(" ");
      for (String s : words) {
         System.out.println(s);
      }
      // Strings are always immutable to if we take a string parameter we cannot modify it and send it back but would have to create a new one and return it.
   }

   public static int hasChar(String word, char letter) {
      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) == letter) {
            return i;
         }
      }
      return -1;
   }

   public static boolean hasLetter(String word, char letter) {
      for (char c : word.toCharArray()) {
         if (c == letter) {
            return true;
         }
      }
      return false;
   }
}

