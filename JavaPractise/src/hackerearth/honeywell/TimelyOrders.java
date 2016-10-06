package hackerearth.honeywell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class TimelyOrders {
    public static void main(String args[]) throws Exception {
        HashMap<Integer, Integer> mMap = new HashMap<>();
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        String mCasesReaderStr = mReader.readLine();
        int mTestCases = Integer.parseInt(mCasesReaderStr);
        validateEntries(mMap, mReader, mTestCases);
    }

    private static void validateEntries(HashMap<Integer, Integer> mMap,
                                        BufferedReader mReader, int mTestCases) throws IOException {
//        int[] tArr = new int[mTestCases];
        ArrayList<Integer> tList = new ArrayList<>();
        for (int mCase = 0; mCase < mTestCases; mCase++) {
            String mCaseReaderStr = mReader.readLine();
            String[] mCaseArr = mCaseReaderStr.split("\\s+");
            int mTypeQuery = Integer.parseInt(mCaseArr[0]);
            int mWeight = Integer.parseInt(mCaseArr[1]);
            int mTime = Integer.parseInt(mCaseArr[2]);
            if (mCase == 0 && mTypeQuery == 2) {
                return;
            }
            if (mTypeQuery == 1) {
                mMap.put(mTime, mWeight);
                tList.add(mTime);
            } else if (mTypeQuery == 2) {
                int mTimeInterval = mTime - mWeight;
                if (mTimeInterval < 0) {
                    return;
                }
//                if(tList.get(tList.size()-1) <)
                int mSumOfWeights = 0;
                for (int i = mTimeInterval; i < mTime; i++) {
                    System.out.println("mTimeIteration: " + i);
                    if (i < tList.get(0) || i > tList.get(tList.size() - 1)) {
                        continue;
                    }
                    System.out.println("mTimeInterval: " + mTime + " : " + mWeight
                            + " : " + i + " : " + mMap.containsKey(i)
                            + " : " + tList.get(tList.size() - 1));
                    if (mMap.containsKey(i)) {
                        mSumOfWeights += mMap.get(i);
                    }
                }
                System.out.println(mSumOfWeights);

            }
        }
    }
}
