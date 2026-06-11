package recursion;


import recursion.level1.ArrayRecursion;

import java.util.Arrays;
import java.util.Random;

public class StressTester {

    static final int CASES = 1000;
    static final int MAX_LEN = 20;
    static final int MAX_VAL = 50;

    static int passed = 0;
    static int failed = 0;
    static Random rng = new Random();
    static ArrayRecursion rec = new ArrayRecursion();

    public static void main(String[] args) {
        testReverseArray();
        testIsSorted();
        testLinearSearch();
        testFirstOccurrence();
        testLastOccurrence();

        System.out.println("\n─────────────────────────────");
        System.out.printf("  %d passed  |  %d failed%n", passed, failed);
        System.out.println("─────────────────────────────");
    }

    // ── reverseArray ─────────────────────────────────────────────────────────

    static void testReverseArray() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            int[] expected = bruteReverse(arr.clone());
            rec.reverseArray(arr);
            if (!Arrays.equals(expected, arr)) {
                localFail++;
                if (localFail == 1) // print only first failure
                    System.out.printf("[FAIL] reverseArray  input=%s  expected=%s  got=%s%n",
                            Arrays.toString(arr), Arrays.toString(expected), Arrays.toString(arr));
            }
        }
        report("reverseArray", localFail);
    }

    // ── isSorted ─────────────────────────────────────────────────────────────

    static void testIsSorted() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr = randomArray();
            boolean expected = bruteIsSorted(arr);
            boolean actual   = rec.isSorted(arr);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("[FAIL] isSorted  input=%s  expected=%b  got=%b%n",
                            Arrays.toString(arr), expected, actual);
            }
        }
        report("isSorted", localFail);
    }

    // ── linearSearch ─────────────────────────────────────────────────────────

    static void testLinearSearch() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr    = randomArray();
            int target   = rng.nextInt(MAX_VAL);          // may or may not be in array
            boolean expected = bruteLinearSearch(arr, target);
            boolean actual   = rec.linearSearch(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("[FAIL] linearSearch  arr=%s  target=%d  expected=%b  got=%b%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("linearSearch", localFail);
    }

    // ── firstOccurrence ──────────────────────────────────────────────────────

    static void testFirstOccurrence() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr  = randomArray();
            int target = rng.nextInt(MAX_VAL);
            int expected = bruteFirstOccurrence(arr, target);
            int actual   = rec.firstOccurrence(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("[FAIL] firstOccurrence  arr=%s  target=%d  expected=%d  got=%d%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("firstOccurrence", localFail);
    }

    // ── lastOccurrence ───────────────────────────────────────────────────────

    static void testLastOccurrence() {
        int localFail = 0;
        for (int i = 0; i < CASES; i++) {
            int[] arr  = randomArray();
            int target = rng.nextInt(MAX_VAL);
            int expected = bruteLastOccurrence(arr, target);
            int actual   = rec.lastOccurrence(arr, target);
            if (expected != actual) {
                localFail++;
                if (localFail == 1)
                    System.out.printf("[FAIL] lastOccurrence  arr=%s  target=%d  expected=%d  got=%d%n",
                            Arrays.toString(arr), target, expected, actual);
            }
        }
        report("lastOccurrence", localFail);
    }

    // ── Brute-force reference implementations ────────────────────────────────

    static int[] bruteReverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
        }
        return arr;
    }

    static boolean bruteIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    static boolean bruteLinearSearch(int[] arr, int target) {
        for (int x : arr) if (x == target) return true;
        return false;
    }

    static int bruteFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }

    static int bruteLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i] == target) return i;
        return -1;
    }

    // ── Helpers ──────────────────────────────────────────────────────────────

    static int[] randomArray() {
        int len = rng.nextInt(MAX_LEN) + 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = rng.nextInt(MAX_VAL);
        return arr;
    }

    static void report(String name, int localFail) {
        int localPass = CASES - localFail;
        passed += localPass;
        failed += localFail;
        if (localFail == 0)
            System.out.printf("  PASS  %-20s  (%d cases)%n", name, CASES);
        else
            System.out.printf("  FAIL  %-20s  (%d/%d failed)%n", name, localFail, CASES);
    }
}
