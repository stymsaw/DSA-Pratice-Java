package arrays.level1.basics;

public abstract class CyclicSort {

    /*
     * Variant: Cyclic placement - swap each value to index value-1; exposes missing/duplicate in O(n).
     * [A07] cyclicSort           ☐
     * [A08] findMissing          ☐
     * [A09] firstMissingPositive  ☐
     */

    public abstract void cyclicSort(int[] arr);

    public abstract int findMissing(int[] arr);

    public abstract int firstMissingPositive(int[] arr);

}
