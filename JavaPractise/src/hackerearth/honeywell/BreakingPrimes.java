package hackerearth.honeywell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakingPrimes {
    public static void main(String args[]) throws Exception {
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        String mTestCasesReaderStr = mReader.readLine();
        int mTestCases = Integer.parseInt(mTestCasesReaderStr);
        findPrimeNumber(mReader, mTestCases);
    }

    private static void findPrimeNumber(BufferedReader mReader, int mTestCases) throws IOException {
        for (int mCase = 0; mCase < mTestCases; mCase++) {
            int tempCount = 0;
            String mCaseReaderStr = mReader.readLine();
            String[] mCaseArr = mCaseReaderStr.split("\\s+");
            int mFNumber = Integer.parseInt(mCaseArr[0]);
            int mSNumber = Integer.parseInt(mCaseArr[1]);
            int mPrimeNumbers = Integer.parseInt(mCaseArr[2]);
            if (mFNumber <= 1)
                mFNumber = 2;
            if (mSNumber <= 1)
                printNumber(-1);
            else {
                calPrimeNumOtherthanOne(mFNumber, mSNumber, mPrimeNumbers, tempCount);
            }
        }
    }

    private static void calPrimeNumOtherthanOne(int mFNumber, int mSNumber, int mPrimeNumbers, int tempCount) {
        int iteration;
        boolean isExists;
        while (mFNumber <= mSNumber) {
            int mSqrtVal = (int) Math.sqrt(mFNumber);
            isExists = false;
            for (iteration = 2; iteration <= mSqrtVal; ++iteration) {
                if (mFNumber % iteration == 0) {
                    isExists = true;
                    break;
                }
            }

            if (!isExists)
                tempCount++;
            if (tempCount == mPrimeNumbers) {
                printNumber(mFNumber);
                break;
            }
            ++mFNumber;
        }
        if (tempCount < mPrimeNumbers) {
            printNumber(-1);
        }
    }

    private static void printNumber(int mFNumber) {
        System.out.println(mFNumber);
    }
}
