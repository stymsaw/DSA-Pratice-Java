package recursion.level1.impl;

import recursion.level1.FunctionalRecursion;

import java.util.Arrays;

public class FunctionalRecursionImpl extends FunctionalRecursion {

    @Override
    public int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    @Override
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public long power(int x, int n) {
        if (n == 1) return x;
        return x * power(x, n - 1);
    }

    @Override
    public int findMax(int[] arr) {
        if (arr.length == 1) return arr[0];
        return Math.max(arr[0], findMax(Arrays.copyOfRange(arr, 1, arr.length)));
    }

}
