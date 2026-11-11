import java.util.Scanner;

public class HollowNumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();

        for (int i = 1; i <= total; i++) {
            if (i != 1 && i != total) {
                for (int j = 1; j <= total; j++) {
                    if (j != 1 && j != total) {
                        System.out.print("* ");
                    } else {
                        System.out.print(j + " ");
                    }
                }
            } else {
                for (int j = 1; j <= total; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.print("Asterisks: " + (total - 2) * (total - 2));
        input.close();
    }
}
