package GFG;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GV Sharma on 9/17/2016.
 */
public class PossiblePalindromePartitions {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        String palindromicString = "vikatakig";
        for (int i = 0; i < palindromicString.length(); i++) {
            for (int j = i + 1; j < palindromicString.length(); j++) {
                String temp = palindromicString.substring(i, j + 1);
                if (isPalindrome(temp)) {
                    listString.add(temp);
                    System.out.println(temp);
                }
            }
        }
    }

    private static boolean isPalindrome(String temp) {
        int length;
        if (temp.length() % 2 == 0) {
            length = temp.length() / 2;
        } else {
            length = (temp.length() - 1) / 2;
        }
        for (int i = 0; i < length; i++) {
            if (!(temp.charAt(i) == temp.charAt(temp.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
