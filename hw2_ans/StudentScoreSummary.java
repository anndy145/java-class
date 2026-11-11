import java.util.Scanner;

public class StudentScoreSummary {
    public static void main(String[] var0) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int Excellent = 0;
        int Pass = 0;
        int Fail = 0;
        int student = input.nextInt();
        for (int i = 0; i < student; i++) {
            int score = input.nextInt();
            if (score > max)
                max = score;

            if (score >= 80) {
                System.out.println("Excellent");
                Excellent++;
            } else if (score < 60) {
                System.out.println("Fail");
                Fail++;
            } else {
                System.out.println("Pass");
                Pass++;
            }
        }
        System.out.println("Excellent: " + Excellent);
        System.out.println("Pass: " + Pass);
        System.out.println("Fail: " + Fail);
        System.out.println("Highest: " + max);

        input.close();
    }
}
