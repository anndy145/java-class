
// Display every character between Unicode 65 and 122
// Start new line after 20 characters

import java.util.Scanner;

public class DebugSix2 {
   public static void main(String[] args) {
      final int MIN = 65;
      final int MAX = 122;
      final int NUMBERLINE = 20;

      char letter;
      int a;
      int lines = 0;

      for (a = MIN; a <= MAX; a++) {
         letter = (char) a;
         lines++;
         System.out.print("  " + letter);

         if (lines == NUMBERLINE) {
            lines = 0;
            System.out.println();
         }
      }

      System.out.println("\nEnd of application");
   }
}
