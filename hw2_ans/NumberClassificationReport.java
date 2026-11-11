import java.util.Scanner;

public class NumberClassificationReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int EvenSum = 0;

        for (int i = 0; i < total; i++) {
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("Zero Even");
                zero++;
            } else if (num < 0) {
                negative++;
                if (num % 2 == 0) {
                    EvenSum += num;
                    System.out.println("Negative Even");
                } else {
                    System.out.println("Negative Odd");
                }
            } else {
                positive++;
                if (num % 2 == 0) {
                    EvenSum += num;
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            }
        }
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
        System.out.println("Even sum: " + EvenSum);

        input.close();
    }
}
