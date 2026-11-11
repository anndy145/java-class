import java.util.Scanner;

public class WordArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine(); // 清除換行符號
        String[] words = new String[total];
        int palindromeCount = 0;

        for (int i = 0; i < total; i++) {
            words[i] = input.nextLine();
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equalsIgnoreCase(reversed)) {
                palindromeCount++;
            }
        }

        for (int i = total - 1; i >= 0; i--) {
            System.out.println(new StringBuilder(words[i]).reverse());
        }

        System.out.println("Palindrome words: " + palindromeCount);
        input.close();
    }
}
/*
 * 寫一個 Java 程式來處理一個單字數組。程式首先讀取一個整數 n，表示單字的數量。
 * 然後，它讀取 n 個單詞，每行一個，並將它們儲存在字串陣列中。
 * 按輸入順序的相反順序顯示這些單字。在顯示每個單字之前，使用 StringBuilder 反轉其字元。
 * 保留原始的大寫和小寫字元。
 * 在處理數組的過程中，還要統計有多少個原始單字是回文。
 * 如果一個單字正讀反讀都相同（忽略字母大小寫），則該單字是回文。
 * 例如，「Level」是回文，而「Java」不是。每個單字母單字都是回文。
 * 將每個反轉後的單字顯示在單獨的一行上。最後，
 * 使用如下所示的標籤顯示回文單字的數量。
 * 假設 1 ≤ n ≤ 30，且每個單字包含 1 到 30 個不含空格的英文字母。從標準輸入讀取數據，不顯示輸入提示
 */