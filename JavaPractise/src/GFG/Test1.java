package GFG;

import java.util.Scanner;

/**
 * Created by GV Sharma on 8/12/2016.
 */
public class Test1 {
    private static final String TAG = Test1.class.getName();
    private static int i;

    public static void main(String[] args) {

//        System.out.println(18 % 10 + " : " + 18 / 10 + " : " + 8 % 10 + " : " + 8 / 10);

//        Scanner scanner = new Scanner(System.in);
//        int testCases = scanner.nextInt();
//        startTest(scanner, testCases);
        //123----321-----3*100+2*10+1*1
        //546----645------6*100+4*
//        int n=123,rem=0,rev=0;
//        while(n!=0){
//            rem=n%10;
//            rev=rev*10 + rem;
//            n=n/10;
//        }

        String str = "ashok";
        char[] originalArr = str.toCharArray();
        char[] reverseArr = new char[originalArr.length];
        for (int i = 0; i < originalArr.length; i++) {
            reverseArr[i] = originalArr[originalArr.length - i - 1];
            reverseArr[reverseArr.length - i - 1] = originalArr[i];
        }
        String reverseStr = String.valueOf(reverseArr);
        System.out.print(reverseStr);

    }

    private static void print(int number) {
        System.out.println(TAG + " : " + number);
    }

    private static void startTest(Scanner scanner, int testCases) {
        if (testCases <= 0 || testCases > 100)
            return;
        for (int i = 0; i < testCases; i++) {
            int number = scanner.nextInt();
            int digitSum = getDigitSum(number);
            checkAnswer(number, digitSum);
        }
    }

    private static void checkAnswer(int number, int digitSum) {
        if (number % digitSum == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static int getDigitSum(int number) {
        if (number <= 0 || number > 100000) {
            return 0;
        }
        int digit = 0;
        int temp = number;
        while (temp > 0) {
            digit = digit + (temp % 10);
            temp = temp / 10;
        }
        return digit;
    }
}
