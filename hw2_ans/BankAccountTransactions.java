import java.util.Scanner;

public class BankAccountTransactions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = input.nextInt();
        int action = input.nextInt();
        int Rejected = 0;

        while (action != 0) {
            if (action > 0) {
                balance += action;
                System.out.println("Balance: " + balance);
            } else {
                if ((action + balance) < 0) {
                    System.out.println("Rejected");
                    Rejected++;
                } else {
                    balance += action;
                    System.out.println("Balance: " + balance);
                }
            }

            action = input.nextInt();
        }
        System.out.println("Final balance: " + balance);
        System.out.println("Rejected withdrawals: " + Rejected);

        input.close();
    }
}