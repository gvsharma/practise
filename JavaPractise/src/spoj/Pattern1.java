package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by GV Sharma on 8/15/2016.
 */
public class Pattern1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
            String line1 = reader.readLine();
            String[] rowsCols = line1.split(" ");
            System.out.print(rowsCols);
        }
    }

}
