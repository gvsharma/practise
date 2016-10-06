package interview;

/**
 * Created by GV Sharma on 9/14/2016.
 */
public class FibonacciNumber {

    private static int number;

    public static void main(String[] args) {
        fib(6);
        System.out.println("Fib recursion: " + number);
        System.out.print("Fib Dynamic: " + fibByDynamic(6));
    }

    //recursion
    public static int fib(int n) {
        if (n == 0) {
            number = 0;
            return number;
        }
        if (n == 1) {
            number = 1;
            return number;
        }
        number = fib(n - 1) + fib(n - 2);
        return number;
    }


    public static int fibByDynamic(int n) {
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
