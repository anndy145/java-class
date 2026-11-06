
// A PhoneBook is a Book with a city
import java.util.Scanner;

public class DebugNine1 {
   public static void main(String[] args) {
      String area;
      int pages;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter city for phone book >> ");
      area = input.nextLine();
      System.out.print("Enter number of pages in " + area + "'s phone book >> ");
      pages = input.nextInt();
      DebugPhoneBook pb = new DebugPhoneBook(pages, area);
      pb.display();

      input.close();
   }
}