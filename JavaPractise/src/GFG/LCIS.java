package GFG;

import java.util.Arrays;

/**
 * Created by GV Sharma on 9/17/2016.
 */
public class LCIS {
    public int getLongestCommonIncrementingArray(int[] array1, int[] array2) {
        int[] array = new int[array1.length];
        int[] sortArray = sortArray(array1);
        int count = 0;
        for (int i = 0; i < sortArray.length; i++) {

            for (int j = 0; j < array2.length; j++) {
                if (sortArray[i] == array2[i]) {
                    array[count] = sortArray[i];
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    private int[] sortArray(int[] array1) {
        Arrays.sort(array1);
        return array1;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{3, 4, 9, 1};
        int[] array2 = new int[]{5, 3, 4, 9, 10, 2, 1};
        LCIS lcis = new LCIS();
        int lcisArray = lcis.getLongestCommonIncrementingArray(array1, array2);
        System.out.println(lcisArray);

    }

}
