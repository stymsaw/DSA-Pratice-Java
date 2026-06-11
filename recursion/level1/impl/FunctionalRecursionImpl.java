package recursion.level1.impl;

import recursion.level1.FunctionalRecursion;

public class FunctionalRecursionImpl extends FunctionalRecursion {

    @Override
    public int factorial(int n) {
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    @Override
    public int fibonacci(int n) {
        return 0; // TODO
    }

    @Override
    public long power(int x, int n) {
        return 0; // TODO
    }

}
