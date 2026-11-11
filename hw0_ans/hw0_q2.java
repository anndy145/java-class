import java.util.Scanner;

public class hw0_q2 {
    public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sunshine Seashore makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }

    public static int computeHours(int totalMinutes) {
        return totalMinutes / 60;
    }

    public static int computeExtraMinutes(int totalMinutes) {
        return totalMinutes % 60;
    }

    public static int computePrice(int hours, int extraMinutes) {
        return hours * 40 + extraMinutes * 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();

        int hours = computeHours(min);
        int minutes = computeExtraMinutes(min);
        int price = computePrice(hours, minutes);

        displayMotto();
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total: $" + price);
        input.close();
    }
}