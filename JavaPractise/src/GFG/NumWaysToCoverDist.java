package GFG;

/**
 * Created by GV Sharma on 9/17/2016.
 */
public class NumWaysToCoverDist {
    public static void main(String[] args) {
        int dist = 4;
//        System.out.print(printCountRec(dist) + " ");
        System.out.print(printCountDP(dist) + " ");
    }

    //recursion
    static int printCountRec(int dist) {
        // Base cases
        if (dist < 0) return 0;
        if (dist == 0) return 1;

        // Recur for all previous 3 and add the results
        return printCountRec(dist - 1) +
                printCountRec(dist - 2) +
                printCountRec(dist - 3);
    }

    //DP
    static int printCountDP(int dist) {
        int count[] = new int[dist + 1];

        // Initialize base values. There is one way to cover 0 and 1
        // distances and two ways to cover 2 distance
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;

        // Fill the count array in bottom up manner
        for (int i = 3; i <= dist; i++)
            count[i] = count[i - 1] + count[i - 2] + count[i - 3];

        return count[dist];
    }
}
