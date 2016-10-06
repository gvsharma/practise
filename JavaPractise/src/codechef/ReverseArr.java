package codechef;

/**
 * Created by GV Sharma on 10/6/2016.
 */
public class ReverseArr {
    public static void main(String[] args0) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr, 0);
        System.out.println();
        reverseArray(arr, 0, 5);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {//1,2,3
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr, 0);
    }

    public static void printArray(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
