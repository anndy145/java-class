import java.util.Scanner;

public class StudentNameSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        int match = 0;
        String[] list = new String[total];

        // 輸入n個名字
        for (int i = 0; i < total; i++) {
            list[i] = input.nextLine();
        }
        String keyword = input.nextLine().toLowerCase();
        // 判斷相符
        for (int i = 0; i < total; i++) {
            if (list[i].toLowerCase().contains(keyword)) {
                System.out.println(list[i]);
                match++;
            }
        }

        input.close();
        System.out.println("Matches: " + match);
    }
}
