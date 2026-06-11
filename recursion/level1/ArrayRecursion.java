package recursion.level1;

public class ArrayRecursion extends RecursionLevel1 {

    @Override
    public int sumOfFirstNNumbers(int n) {
        return sumOfFirstNNumbers(n, 0);
    }

    @Override
    public int sumOfArray(int[] arr) {
        return sumOfArray(arr, 0, 0);
    }

    @Override
    public int factorialParameterized(int n) {
        return factorialParameterized(n, 1);
    }

    @Override
    public int countDigits(int number) {
        return countDigits(number, 0);
    }

    @Override
    public int sumOfDigits(int number) {
        return sumOfDigits(number, 0);
    }

    private int sumOfDigits(int number, int sum) {
        if (number < 1) return sum;
        int lastDigit = number % 10;
        sum = sum + lastDigit;
        return sumOfDigits(number / 10, sum);
    }

    private int countDigits(int number, int count) {
        if (number < 1) return count;
        return countDigits(number / 10, count + 1);
    }

    private int factorialParameterized(int n, int factorial) {
        if (n < 1) return factorial;
        factorial = factorial * n;
        return factorialParameterized(n - 1, factorial);
    }

    private int sumOfArray(int[] arr, int index, int sum) {
        if (index > arr.length - 1) return sum;
        sum = arr[index] + sum;
        return sumOfArray(arr, index + 1, sum);
    }

    private int sumOfFirstNNumbers(int n, int sum) {
        if (n < 1) return sum;
        sum = sum + n;
        return sumOfFirstNNumbers(n - 1, sum);
    }

    @Override
    public void reverseArray(int[] arr) {
        reverseArray(arr, 0, arr.length - 1);
    }

    @Override
    public boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    private boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    @Override
    public boolean linearSearch(int[] arr, int target) {
        return linearSearch(arr, target, 0);
    }

    private void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        swapNumbers(arr, start, end);
        reverseArray(arr, start + 1, end - 1);
    }

    private boolean linearSearch(int[] arr, int target, int index) {
        if (index > arr.length - 1) return false;
        if (arr[index] == target) return true;
        return linearSearch(arr, target, index + 1);
    }

    private static void swapNumbers(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    @Override
    public int firstOccurrence(int[] arr, int target) {
        return firstOccurrence(arr, target, 0);
    }

    @Override
    public int lastOccurrence(int[] arr, int target) {
        return lastOccurrence(arr, target, 0, -1);
    }

    private int lastOccurrence(int[] arr, int target, int index, int lastSeen) {
        if (index > arr.length - 1) return lastSeen;
        if (arr[index] == target) lastSeen = index;
        return lastOccurrence(arr, target, index + 1, lastSeen);
    }

    private int firstOccurrence(int[] arr, int target, int index) {
        if (index > arr.length - 1) return -1;
        if (arr[index] == target) return index;
        return firstOccurrence(arr, target, index + 1);
    }


}
