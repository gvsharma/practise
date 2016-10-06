package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by GV Sharma on 8/14/2016.
 */
public class MillyPensProblem {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int testCases = scanner.nextInt();
//        startTest(scanner, testCases);
//    }
//
//    private static void startTest(Scanner scanner, int testCases) {
//        if (testCases < 1 || testCases > 25) {
//            return;
//        }
//        for (int i = 0; i < testCases; i++) {
//            int N = scanner.nextInt();
//            int P = scanner.nextInt();
//            int M = scanner.nextInt();
//            validateTotalPens(scanner, N, P, M);
//        }
//    }
//
//    private static void validateTotalPens(Scanner scanner, int n, int p, int m) {
//        if (n < 1 || n > 1000000) {
//            return;
//        }
//        System.out.println("Numbers: " + n + " : " + p + " : " + m);
//        boolean isPensNotSold = enterNpens(scanner, n, p, m);
//        if (isPensNotSold) {
//            System.out.println("They can't");
//        } else {
//            System.out.println("They can");
//        }
//    }
//
//    private static boolean enterNpens(Scanner scanner, int n, int p, int m) {
//        Stack<Integer> totalPens = getTotalPensStack(scanner, n);
//        Stack<Integer> pranjulPens = pranjulPens(scanner, n, p);
//        Stack<Integer> millyPens = millyPens(scanner, n, m);
//        boolean isPensNotSold = false;
//        System.out.println("Actua Pen Size Before: " + totalPens.size());
//        for (int tot = 0; tot < totalPens.size(); tot++) {
//            int actualPen = totalPens.get(tot);
//            for (int i = 0; i < pranjulPens.size(); i++) {
//                int pranjulPen = pranjulPens.get(i);
//                System.out.println("PranjulPen: " + pranjulPen);
//                if (actualPen == pranjulPen) {
////                    isPensNotSold = true;
//                    totalPens.removeElement(actualPen);
////                    return isPensNotSold;
//                }
//            }
//        }
//
//        System.out.println("Actua Pen Size After: " + totalPens.size());
//
//        for (int tot = 0; tot < totalPens.size(); tot++) {
//            int actualPen = totalPens.get(tot);
//            System.out.println("Actua Pen: " + actualPen);
//            for (int j = 0; j < millyPens.size(); j++) {
//                int millyPen = millyPens.get(j);
//                System.out.println("MillyPen: " + millyPen);
//                if (actualPen == millyPen) {
////                    isPensNotSold = true;
//                    totalPens.removeElement(actualPen);
////                    return isPensNotSold;
//                }
//            }
//        }
//
//        if (totalPens.size() > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private static Stack<Integer> getTotalPensStack(Scanner scanner, int n) {
//        Stack<Integer> totalPens = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            int penId = scanner.nextInt();
//            totalPens.push(penId);
////            if (i != n) {
////                System.out.print(penId + " ");
////            } else {
////                System.out.print(penId);
////            }
//        }
//        return totalPens;
//    }
//
//    private static Stack<Integer> millyPens(Scanner scanner, int n, int m) {
//        Stack<Integer> pranjulPens = new Stack<>();
//        for (int i = 0; i < m; i++) {
//            int penId = scanner.nextInt();
//            pranjulPens.push(penId);
////            if (i != m) {
////                System.out.print(penId + " ");
////            } else {
////                System.out.print(penId);
////            }
//        }
//        return pranjulPens;
//    }
//
//    private static Stack<Integer> pranjulPens(Scanner scanner, int n, int p) {
//        Stack<Integer> millyPens = new Stack<>();
//        for (int i = 0; i < p; i++) {
//            int penId = scanner.nextInt();
//            millyPens.push(penId);
////            if (i != p) {
////                System.out.print(penId + " ");
////            } else {
////                System.out.print(penId);
////            }
//        }
//        return millyPens;
//    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int index = 0; index < T; index++) {
            String line = br.readLine();
            String[] str = line.split(" ");
            int N = Integer.parseInt(str[0]);
            String[] mainArr = new String[N];
            for(int i = 0; i < N; i++) {
                mainArr[i] = i + 1 + "";
            }
            int P = Integer.parseInt(str[1]);
            int M = Integer.parseInt(str[2]);

            line = br.readLine();
            str = line.split(" ");
            List<String> PArr = null;
            PArr = Arrays.asList(str);

            line = br.readLine();
            str = line.split(" ");
            List<String> MArr = null;
            MArr = Arrays.asList(str);

            boolean flag = false;
            for(String ele : mainArr) {
                if(!MArr.contains(ele) && !PArr.contains(ele)) {
                    System.out.println("They can't");
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println("They can");
            }

        }
    }
}
