package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by GV Sharma on 8/14/2016.
 */
public class PowersEverywhereProblem {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String querries = br.readLine();
            int querriesNum = Integer.parseInt(querries);
            for (int j = 0; j < querriesNum; j++) {
                String q = br.readLine();
                int qNum = Integer.parseInt(q);
                System.out.println((int) isPower(qNum));
            }
        }
    }

    static double isPower(double n) {
        System.out.println(System.currentTimeMillis());
        if (n <= 1) return n;
        double temp = 0;
        double minNumber = 0;
        for (int x = 2; x <= Math.sqrt(n); x++) {
            double p = x;
            while (p <= n) {
                p *= x;
                if (p == n)
                    return 0;
                if (p < n) {
                    temp = Math.abs(p - n);
                    if (minNumber == 0) {
                        minNumber = temp;
                    }
                    if (temp < minNumber) {
                        minNumber = temp;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(minNumber);
        System.out.println(System.currentTimeMillis());
        return minNumber;
    }

}
