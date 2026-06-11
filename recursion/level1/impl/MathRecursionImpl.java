package recursion.level1.impl;

import recursion.level1.MathRecursion;

public class MathRecursionImpl extends MathRecursion {

    @Override
    public int sumOfFirstNNumbers(int n) {
        return sumOfFirstNNumbers(n, 0);
    }

    private int sumOfFirstNNumbers(int n, int sum) {
        if (n < 1) return sum;
        return sumOfFirstNNumbers(n - 1, sum + n);
    }

    @Override
    public int sumOfArray(int[] arr) {
        return sumOfArray(arr, 0, 0);
    }

    private int sumOfArray(int[] arr, int index, int sum) {
        if (index > arr.length - 1) return sum;
        return sumOfArray(arr, index + 1, sum + arr[index]);
    }

    @Override
    public int factorialParameterized(int n) {
        return factorialParameterized(n, 1);
    }

    private int factorialParameterized(int n, int factorial) {
        if (n < 1) return factorial;
        return factorialParameterized(n - 1, factorial * n);
    }

    @Override
    public int countDigits(int number) {
        return countDigits(number, 0);
    }

    private int countDigits(int number, int count) {
        if (number < 1) return count;
        return countDigits(number / 10, count + 1);
    }

    @Override
    public int sumOfDigits(int number) {
        return sumOfDigits(number, 0);
    }

    private int sumOfDigits(int number, int sum) {
        if (number < 1) return sum;
        return sumOfDigits(number / 10, sum + number % 10);
    }
}
