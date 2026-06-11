package recursion.test;

import recursion.level1.impl.ArrayRecursionImpl;
import recursion.level1.impl.MathRecursionImpl;

import java.util.Arrays;
import java.util.Random;

public class StressTester {

    static final int CASES = 1000;
    static final int MAX_LEN = 20;
    static final int MAX_VAL = 50;

    static int passed = 0;
    static int failed = 0;
    static Random rng = new Random();
    static ArrayRecursionImpl arrImpl = new ArrayRecursionImpl();
    static MathRecursionImpl mathImpl = new MathRecursionImpl();

    public static void main(String[] args) {
        System.out.println("── Array Recursion ──────────────────────");
        testReverseArray();
        testIsSorted();
        testLinearSearch();
        testFirstOccurrence();
        testLastOccurrence();

        System.out.println("\n── Math Recursion ───────────────────────");
        testSumOfFirstNNumbers();
        testSumOfArray();
        testFactorialParameterized();
        testCountDigits();
        testSumOfDigits();

        System.out.println("\n─────────────────────────────────────────");
        System.out.printf("  %d passed  |  %d failed%n", passed, failed);
        System.out.println("─────────────────────────────────────────");
    }

    // ── Array Recursion tests ─────────────────────────────────────────────────

    static void testReverseArray() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int[] expected = arr.clone();
            for (int l = 0, r = expected.length - 1; l < r; l++, r--) {
                int tmp = expected[l]; expected[l] = expected[r]; expected[r] = tmp;
            }
            arrImpl.reverseArray(arr);
            if (!Arrays.equals(expected, arr)) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] reverseArray  got=%s  expected=%s%n",
                            Arrays.toString(arr), Arrays.toString(expected));
            }
        }
        report("reverseArray", localFail);
    }

    static void testIsSorted() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            boolean expected = bruteSorted(arr);
            boolean actual = arrImpl.isSorted(arr);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] isSorted  arr=%s  expected=%b  got=%b%n",
                            Arrays.toString(arr), expected, actual);
            }
        }
        report("isSorted", localFail);
    }

    static void testLinearSearch() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int target = rng.nextInt(MAX_VAL);
            boolean expected = bruteContains(arr, target);
            boolean actual = arrImpl.linearSearch(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] linearSearch  arr=%s  target=%d  expected=%b  got=%b%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("linearSearch", localFail);
    }

    static void testFirstOccurrence() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int target = rng.nextInt(MAX_VAL);
            int expected = bruteFirst(arr, target);
            int actual = arrImpl.firstOccurrence(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] firstOccurrence  arr=%s  target=%d  expected=%d  got=%d%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("firstOccurrence", localFail);
    }

    static void testLastOccurrence() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int target = rng.nextInt(MAX_VAL);
            int expected = bruteLast(arr, target);
            int actual = arrImpl.lastOccurrence(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] lastOccurrence  arr=%s  target=%d  expected=%d  got=%d%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("lastOccurrence", localFail);
    }

    // ── Math Recursion tests ──────────────────────────────────────────────────

    static void testSumOfFirstNNumbers() {
        int localFail = 0;
        for (int n = 0; n <= CASES; n++) {
            int expected = n * (n + 1) / 2;
            int actual = mathImpl.sumOfFirstNNumbers(n);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] sumOfFirstNNumbers  n=%d  expected=%d  got=%d%n", n, expected, actual);
            }
        }
        report("sumOfFirstNNumbers", localFail);
    }

    static void testSumOfArray() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int expected = Arrays.stream(arr).sum();
            int actual = mathImpl.sumOfArray(arr);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] sumOfArray  arr=%s  expected=%d  got=%d%n",
                            Arrays.toString(arr), expected, actual);
            }
        }
        report("sumOfArray", localFail);
    }

    static void testFactorialParameterized() {
        int localFail = 0;
        long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
        for (int n = 0; n <= 10; n++) {
            int actual = mathImpl.factorialParameterized(n);
            if (factorials[n] != actual) {
                localFail++;
                System.out.printf("  [FAIL] factorial  n=%d  expected=%d  got=%d%n", n, factorials[n], actual);
            }
        }
        report("factorialParameterized", localFail);
    }

    static void testCountDigits() {
        int localFail = 0;
        for (int i = 1; i <= CASES; i++) {
            int expected = String.valueOf(i).length();
            int actual = mathImpl.countDigits(i);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] countDigits  n=%d  expected=%d  got=%d%n", i, expected, actual);
            }
        }
        report("countDigits", localFail);
    }

    static void testSumOfDigits() {
        int localFail = 0;
        for (int i = 1; i <= CASES; i++) {
            int expected = String.valueOf(i).chars().map(c -> c - '0').sum();
            int actual = mathImpl.sumOfDigits(i);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("  [FAIL] sumOfDigits  n=%d  expected=%d  got=%d%n", i, expected, actual);
            }
        }
        report("sumOfDigits", localFail);
    }

    // ── Brute-force helpers ───────────────────────────────────────────────────

    static boolean bruteSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    static boolean bruteContains(int[] arr, int target) {
        for (int x : arr) if (x == target) return true;
        return false;
    }

    static int bruteFirst(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) return i;
        return -1;
    }

    static int bruteLast(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) if (arr[i] == target) return i;
        return -1;
    }

    static int[] randomArray() {
        int len = rng.nextInt(MAX_LEN) + 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = rng.nextInt(MAX_VAL);
        return arr;
    }

    static void report(String name, int localFail) {
        passed += CASES - localFail;
        failed += localFail;
        if (localFail == 0)
            System.out.printf("  PASS  %-22s  (%d cases)%n", name, CASES);
        else
            System.out.printf("  FAIL  %-22s  (%d/%d failed)%n", name, localFail, CASES);
    }
}
