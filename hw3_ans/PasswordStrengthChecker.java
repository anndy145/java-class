import java.util.*;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號

        int strong = 0;

        char[] specialChar = { '!', '@', '#', '$', '%', '&', '*' };
        for (int i = 0; i < total; i++) {
            String password = input.nextLine();
            boolean len = password.length() >= 8;
            boolean upper = false;
            boolean lower = false;
            boolean number = false;
            boolean special = false;

            for (int j = 0; j < password.length(); j++) {
                char temp = password.charAt(j);
                if (Character.isUpperCase(temp))
                    upper = true;
                if (Character.isLowerCase(temp))
                    lower = true;
                if (Character.isDigit(temp))
                    number = true;
                for (int k = 0; k < specialChar.length; k++) {
                    if (specialChar[k] == temp) {
                        special = true;
                    }
                }
            }
            if (len && upper && lower && number && special) {
                System.out.println("Strong");
                strong++;
            } else {
                System.out.println("Weak");
            }
        }
        System.out.println("Strong passwords: " + strong);
        input.close();
    }
}
/*
 * len
 * upper
 * lower
 * number
 * special
 * 至少包含八個字元。
 * 至少包含一個大寫字母。
 * 至少包含一個小寫字母。
 * 至少包含一個數字。
 * 至少包含以下特殊字元之一：!@#$%&*。
 */