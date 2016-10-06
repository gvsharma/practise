package GFG;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by GV Sharma on 8/13/2016.
 */
public class PizzaProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        startTest(scanner, testCases);
    }

    private static void startTest(Scanner scanner, int testCases) {
        if (testCases < 1 || testCases > 100) {
            return;
        }
        for (int i = 0; i < testCases; i++) {
            Stack<Integer> firstStack = new Stack<>();
            Stack<Integer> secondStack = new Stack<>();
            createFirstStack(firstStack, scanner);
//            System.out.println();
            createSecondStack(secondStack, scanner);
            findDuplicates(firstStack, secondStack);
        }

    }

    private static void findDuplicates(Stack<Integer> firstStack, Stack<Integer> secondStack) {
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < firstStack.size(); i++) {
            int firstStackNumber = firstStack.get(i);
            for (int j = 0; j < secondStack.size(); j++) {
                int secondStackNumber = secondStack.get(j);
                if (firstStackNumber == secondStackNumber) {
                    tempStack.push(secondStackNumber);
                }
            }
        }
        if (tempStack.size() > 0)
            System.out.print(tempStack.size());
    }

    private static void createFirstStack(Stack<Integer> firstStack, Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            int radii = scanner.nextInt();
            fillFirstStack(firstStack, radii);
        }
    }

    private static void createSecondStack(Stack<Integer> secondStack, Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            int radii = scanner.nextInt();
            fillSecondStack(secondStack, radii);
        }
    }

    private static void fillFirstStack(Stack<Integer> firstStack, int radii) {
        if (radii < 1 || radii > 1000) {
            return;
        }
        firstStack.push(radii);
//        System.out.print(radii + " ");
    }

    private static void fillSecondStack(Stack<Integer> secondStack, int radii) {
        if (radii < 1 || radii > 1000) {
            return;
        }
        secondStack.push(radii);
//        System.out.print(radii + " ");
    }
}
