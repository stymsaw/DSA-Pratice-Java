package arrays.level1.prefixsum;

public abstract class OneD {

    /*
     * Variant: 1D prefix (+ hashmap) - cumulative sums; map of seen prefixes for subarray queries.
     * [D01] runningSum             ☐
     * [D02] subarraySumCountK      ☐
     * [D03] longestZeroSumSubarray  ☐
     */

    public abstract int[] runningSum(int[] arr);

    public abstract int subarraySumCountK(int[] arr, int k);

    public abstract int longestZeroSumSubarray(int[] arr);

}
