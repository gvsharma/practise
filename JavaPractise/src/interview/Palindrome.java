package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GV Sharma on 9/14/2016.
 */
public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();

        checkPalindrom(number);
    }

    private static void checkPalindrom(String numberStr) {
        int sum = 0;
        int remainder = 0;
        int number = Integer.parseInt(numberStr);
        int originalNumber = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if(sum == originalNumber) {
            System.out.print("its a palindrome");
        } else {
            System.out.print("Not a palindrome");
        }
    }
}
