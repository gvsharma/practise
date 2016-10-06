package programmingquestions;

/**
 * Created by GV Sharma on 8/12/2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
//        System.out.print(fib(5));
        System.out.print(fibNumber(5));
    }

    /**
     * Recursion way.
     *
     * @param n
     * @return
     */
    private static int fib(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fibNumber(int n) {
        int[] arr = new int[n + 1];
        int i;

        arr[0] = 0;
        arr[1] = 1;
        for (i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
