package arrays.level1.binarysearch;

public abstract class OnArray {

    /*
     * Variant: On a sorted array - classic halving plus boundary (lower/upper bound) searches.
     * [H01] binarySearch     ☐
     * [H02] firstOccurrence  ☐
     * [H03] countOccurrences  ☐
     */

    public abstract int binarySearch(int[] arr, int target);

    public abstract int firstOccurrence(int[] arr, int target);

    public abstract int countOccurrences(int[] arr, int target);

}
