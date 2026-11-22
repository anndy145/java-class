import java.util.Scanner;

class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }
}

interface FineCalculable {
    int calculateFine(int daysLate);
}

class Book extends LibraryItem implements FineCalculable {
    Book(String title) {
        super(title);
    }

    @Override
    public int calculateFine(int daysLate) {
        int fine = daysLate * 5;

        if (fine > 100) {
            fine = 100;
        }
        return fine;
    }
}

class Magazine extends LibraryItem implements FineCalculable {
    Magazine(String title) {
        super(title);
    }

    @Override
    public int calculateFine(int daysLate) {
        int fine = daysLate * 3;

        if (fine > 50) {
            fine = 50;
        }
        return fine;
    }
}

class DVD extends LibraryItem implements FineCalculable {
    DVD(String title) {
        super(title);
    }

    @Override
    public int calculateFine(int daysLate) {
        int fine = daysLate * 10;

        if (fine > 200) {
            fine = 200;
        }
        return fine;
    }
}

public class Library_Late_Fees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        int sum = 0;

        for (int i = 0; i < total; i++) {
            char type = input.next().charAt(0);
            String title = input.next();
            int daysLate = input.nextInt();
            FineCalculable item;

            if (type == 'B') {
                item = new Book(title);
            } else if (type == 'M') {
                item = new Magazine(title);
            } else if (type == 'D') {
                item = new DVD(title);
            } else {
                break;
            }

            System.out.println(title + " " + item.calculateFine(daysLate));
            sum += item.calculateFine(daysLate);
        }

        System.out.println("Total " + sum);

        input.close();
    }
}
