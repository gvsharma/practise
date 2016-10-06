package datastructures;

import java.util.Scanner;

/**
 * Created by GV Sharma on 8/12/2016.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("Factorial result: " + getFactorial(n));
    }

    private static int getFactorial(int n) {
        int factNumber = 1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        while (n > 1) {
            factNumber = factNumber * n;
            n--;
        }
        return factNumber;
    }
}
