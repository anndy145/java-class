import java.util.*;

public class SentenceNormalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        StringBuilder normalized = new StringBuilder();
        int wordCount = 0;
        boolean inWord = false; // 標記目前是否正在處理某個單字中

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isWhitespace(ch)) {
                // 如果遇到空格，且之前正處於單字中，代表這個單字剛結束
                if (inWord) {
                    inWord = false;
                }
            } else {
                // 遇到英文字母
                if (!inWord) {
                    // 這是新單字的第一個字母
                    // 如果 normalized 已經有內容，代表這不是第一個單字，需先補上一個空格
                    if (normalized.length() > 0) {
                        normalized.append(' ');
                    }
                    // 首字母轉大寫
                    normalized.append(Character.toUpperCase(ch));
                    wordCount++;
                    inWord = true;
                } else {
                    // 單字中剩餘的字母轉小寫
                    normalized.append(Character.toLowerCase(ch));
                }
            }
        }

        System.out.println(normalized.toString());
        System.out.println("Words: " + wordCount);

    }
}
// jAVA pROGRAMMING is FUN
// Java Programming Is Fun
// Words: 4
/*
 * 寫一個 Java 程序，規範化一行文字。輸入文字包含 1 到 200 個字符，且僅包含英文字母和空格。至少保證包含一個字母。
 * 使用以下規則規範化文字：
 * • 刪除所有前導和尾隨空格。
 * • 將每個連續的空格序列替換為一個空格。
 * • 將每個單字的首字母轉換為大寫。
 * • 將每個單字中所有剩餘的字母轉換為小寫。
 * 使用 StringBuilder 建構規範化的句子。逐一檢查輸入字符，並在更改字母大小寫時使用 Character 類別的方法
 * 在第一行顯示規範化的句子。在第二行，使用標籤“單字數：”顯示單字數。一個單字是由空格分隔的連續字母序列。
 */