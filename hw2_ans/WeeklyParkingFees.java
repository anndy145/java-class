import java.util.*;

public class WeeklyParkingFees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int visit = input.nextInt();
        int total = 0;

        for (int i = 0; i < visit; i++) {
            int time = input.nextInt();
            int price = 0;

            if (time <= 2) {
                price = time * 30;
            } else {
                price = 2 * 30 + (time - 2) * 20;
            }

            if (price > 150) {
                price = 150;
            }

            System.out.println(price);
            total += price;
        }

        System.out.println("Total: " + total);
        input.close();
    }
}