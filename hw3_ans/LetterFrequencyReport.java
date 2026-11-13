import java.util.Scanner;

public class LetterFrequencyReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int[] count = new int[26];// 每個字母出現次數
        int total = 0; // 總字母數

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                count[index]++;
                total++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + count[i]);
            }
        }

        System.out.println("Total letters: " + total);
        input.close();
    }
}