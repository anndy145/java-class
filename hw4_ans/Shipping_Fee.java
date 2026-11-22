import java.util.Scanner;

interface Shipping {
    int calculateFee(int weight);
}

class StandardShipping implements Shipping {
    @Override
    public int calculateFee(int weight) {
        return 50 + weight * 10;
    }
}

class ExpressShipping implements Shipping {
    @Override
    public int calculateFee(int weight) {
        return 100 + weight * 20;
    }
}

public class Shipping_Fee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        Shipping[] shipping = new Shipping[total];

        for (int i = 0; i < total; i++) {
            char type = input.next().charAt(0);
            int weight = input.nextInt();

            if (type == 'S') {
                shipping[i] = new StandardShipping();
            } else if (type == 'E') {
                shipping[i] = new ExpressShipping();
            }
            System.out.println(shipping[i].calculateFee(weight));
        }

        input.close();
    }
}
