import java.util.Scanner;

public class hw1_q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int equip = input.nextInt();
        int min = input.nextInt();

        if ((equip != 1 && equip != 2 && equip != 3) || min < 0) {
            System.out.println("Invalid Input");
        } else {
            int hour = min / 60;
            int extraMin = min % 60;
            int price;

            if (equip == 1) {
                if (extraMin > 40) {
                    price = hour * 40 + 40;
                } else {
                    price = hour * 40 + extraMin;
                }
                System.out.println("Equipment: Kayak");
            } else if (equip == 2) {
                if (extraMin > 40) {
                    price = hour * 45 + 45;
                } else {
                    price = hour * 45 + extraMin;
                }
                System.out.println("Equipment: Canoe");
            } else {
                if (extraMin > 40) {
                    price = hour * 50 + 50;
                } else {
                    price = hour * 50 + extraMin;
                }
                System.out.println("Equipment: Paddleboard");
            }

            System.out.println("Hours: " + hour);
            System.out.println("Extra Minutes: " + extraMin);
            System.out.println("Total: $" + price);
        }

        input.close();
    }
}