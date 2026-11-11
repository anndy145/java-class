import java.util.Scanner;

public class hw1_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int guests = input.nextInt();
        System.out.println("Guests: " + guests);
        System.out.println("Price per guest: $35");
        System.out.println("Total: $" + guests * 35);
        boolean large = guests >= 50;
        System.out.println("Large event: " + large);

        input.close();
    }
}