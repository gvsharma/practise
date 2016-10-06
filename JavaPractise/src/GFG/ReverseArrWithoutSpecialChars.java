package GFG;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by GV Sharma on 9/17/2016.
 */
public class ReverseArrWithoutSpecialChars {
    public static void main(String[] args) {
        String[] array1 = new String[]{"a", "b", "c", "@", "d", "e", "$", "!"};
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");
        String arrayB = "";
        for (int i = 0; i < array1.length; i++) {
            Matcher matcher = pattern.matcher(array1[i]);
            if (matcher.find()) {
                arrayB += array1[i];
// String temp = array1[i];
// array1[i] = array1[array1.length - 1 - i];
// array1[array1.length - 1 - i] = temp;
            }
//            System.out.println(arrayB);
        }
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            Matcher matcher = pattern.matcher(array1[i]);
            if (matcher.find()) {
                array1[i] = String.valueOf(arrayB.charAt(arrayB.length() - j - 1));
                j++;
            }
            System.out.print(array1[i] + " ");
        }

    }
}
